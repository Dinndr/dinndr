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
//Show map marker by latitude/longitude call
	 markerLat = [
	    <c:forEach var="restaurant" items="${dish.restaurant}">
	        <c:out value="${restaurant.latitude}"/>,
	    </c:forEach>
	];
	markerLong = [
	  <c:forEach var="restaurant" items="${dish.restaurant}">
	      <c:out value="${restaurant.longitude}"/>,
	  </c:forEach>
	];
	function myMap() {
		var myRestaurant = {
			lat : marketLat,
			lng : markerLong
		}
		var map = new google.maps.Map(document.getElementById("map"), {
			zoom : 15,
			center : myRestaurant
		});
		var marker = new google.maps.Marker({
			position : myRestaurant,
			map : map
		});
	}