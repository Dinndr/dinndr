var showNextDishButton = document.querySelector(".nextdish");
showNextDishButton.style.visibility = "hidden";
var liked = document.querySelector('.liked');
var myRestaurant;
liked.onclick = function(){
	var x = document.querySelector(".info");
	var hideDislikeButton = document.querySelector(".disliked");
	if (x.style.display === "none") {
		x.style.display = "block";
		google.maps.event.trigger(map, 'resize');
		map.setCenter(new google.maps.LatLng(myRestaurant));
		hideDislikeButton.style.visibility = "hidden";
		showNextDishButton.style.visibility = "visible";
	} else {
		x.style.display = "none";
	}


	var myId = parseFloat(liked.dataset.dishid);
	$.ajax({
		url : 'http://localhost:8080/dishes/' + myId + '/liked',
		method : 'PUT'
	}).done();
};

var showNext = function() {
	$.ajax({
		url: 'http://localhost:8080/dishes/next',
		method: 'GET'
	}).done(function(dish) {
		$('#dishImage').html('<img src="' + dish.image + '">');

		$('.disliked').attr('data-dishid',dish.id);
		$('.liked').attr('data-dishid',dish.id);
		$('.getMapInfo').attr('data-longitude',dish.restaurant.longitude)
		$('.getMapInfo').attr('data-latitude',dish.restaurant.latitude)
		$('#name').html(dish.name)
		$('#description').html(dish.description)
		$('#price').html(dish.price)
		$('#restaurantName').html(dish.restaurant.name)
		$('#address').html(dish.restaurant.address)
		$('#phoneNumber').html(dish.restaurant.phoneNumber)
		$('#hours').html('Hours: ' + dish.restaurant.hours)
		$('#website').html(dish.restaurant.website)
		$('#delivery').html('Delivery? ' + dish.restaurant.delivery)

	}).done(myMap);
}

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



var disliked = document.querySelector('.disliked');
disliked.onclick = function(){
	var a = document.querySelector(".info");
	
	var x = document.querySelector(".next");
	var b = document.querySelector(".image");
	b.style.visibility = "hidden";
	if (x.style.display === "none") {
		x.style.display = "block";
		a.style.display = "none";
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

var viewMore = document.querySelector('.nextdish');
viewMore.onclick = function(){
	var a = document.querySelector(".info");
	
	var x = document.querySelector(".next");
	var b = document.querySelector(".image");
	b.style.visibility = "hidden";
	if (x.style.display === "none") {
		x.style.display = "block";
		a.style.display = "none";
		showNext();
		showNextDishButton.style.visibility = "hidden";
		var hideDislikeButton = document.querySelector(".disliked");
		hideDislikeButton.style.visibility = "visible";
	} else {
		x.style.display = "none";
	}
//	$.ajax({
//	)}.done(showNext);
};
	

