/*add DOM element for viewMore
add DOM element for nextPlease*/

var myRestaurant;
function viewMore() {
	var x = document.querySelector(".info");
	if (x.style.display === "none") {
		x.style.display = "block";
		google.maps.event.trigger(map, 'resize');
		map.setCenter(new google.maps.LatLng(myRestaurant));
	} else {
		x.style.display = "none";
	}

	var liked = document.querySelector(".liked");
	var myId = parseFloat(liked.dataset.dishid);
	$.ajax({
		url : 'http://localhost:8080/dishes/' + myId + '/liked',
		method : 'PUT'
	}).done();

};
var map;
function myMap() {
	var info = document.querySelector(".getMapInfo");

	var myLat = parseFloat(info.dataset.latitude);
	var myLng = parseFloat(info.dataset.longitude);
	 myRestaurant = {
		lat : myLat,
		lng : myLng
	};

	map = new google.maps.Map(document.getElementById("map"), {
		zoom : 15,
		center : myRestaurant,
		disableDefaultUI: true,
	    mapTypeControl: true,
	    mapTypeControlOptions: {
	        style: google.maps.MapTypeControlStyle.HORIZONTAL_BAR,
	        position: google.maps.ControlPosition.BOTTOM_LEFT
	    }
	});
	var marker = new google.maps.Marker({
		position : myRestaurant,
		map : map
	});

};


function showNext() {
	$.ajax({
		url : 'http://localhost:8080/dishes/next',
		method : 'GET'
	}).done(function(dish) {
		$('#dishImage').html('<img src="' + dish.image + '">');
		$('#description').html(dish.description)
		$('#price').html(dish.price)
	}).done(function(restaurant) {
		$('#name').html(restaurant.name)
		$('#address').html(restaurant.address)
		$('#phoneNumber').html(restaurant.phoneNumber)
		$('#hours').html(restaurant.hours)
	});
}
/*
 * var z = document.getElementById("dislikedid"); if (z.addEventListener){
 * z.addEventListener("click", nextPlease()); } else if (z.attachEvent) {
 * z.attachEvent("onclick", nextPlease()); };
 */
function nextPlease() {
	var x = document.querySelector(".next");
	if (x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
	var disliked = document.querySelector(".disliked");
	var myId = parseFloat(disliked.dataset.dishid);
	$.ajax({
		url : 'http://localhost:8080/dishes/' + myId + '/disliked',
		method : 'PUT'
	}).done(showNext);
};

