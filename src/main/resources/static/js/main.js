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

	var myCenter = new google.maps.LatLng(myLat, myLng);
	var myRestaurant = {
		center : myCenter,
		zoom : 15,
	};
	var map = new google.maps.Map(document.getElementById("map"),
			myRestaurant);
	var marker = new google.maps.Marker({
		position : myCenter
	});
	marker.setMap(map);
}; 
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
		url: 'https://localhost:8080/dishes/' + myId + '/disliked',
		type: 'PUT'
	});
    // method should be http PUT
     
//    }).done(function(){
//    }
};
// .done and call function
// access object elements
