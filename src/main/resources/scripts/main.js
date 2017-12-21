function viewMore() {
	var x = document.querySelector(".info");
	if (x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
};

function nextPlease() {
	var x = document.querySelector(".next");
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
//find current dish id
//default is get to pull browser, put to update
$.ajax({
    url: 'https://localhost:8080/dishes/{id}/dislike',
    // method should be http PUT
     
    });
//.done and call function
//access object elements

	