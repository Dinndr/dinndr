function viewMore() {
	var x = document.querySelector(".info");
	if (x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
};

function myMap() {
	var info = document.querySelector(".info");

	var myLat = parseFloat(info.dataset.latitude);
	var myLng = parseFloat(info.dataset.longitude);
	var myRestaurant = {lat: myLat, lng: myLng};
	
	var map = new google.maps.Map(document.getElementById("map"), {
          zoom: 15,
          center: myRestaurant
        });
        var marker = new google.maps.Marker({
          position: myRestaurant,
          map: map
        });
}; 

var showNext = function(){
	$.ajax({
		url: 'http://localhost:8080/dishes/next',
		method: 'GET'
	}).done(function(dish) {
		$('#nextImage').html('<img src="' + dish.image + '">');
	});
}

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
		url: 'http://localhost:8080/dishes/' + myId + '/disliked',
		method: 'PUT'
	}).done(showNext);	
};
// .done and call function to get next dish from Next Dish controller
// access object elements
