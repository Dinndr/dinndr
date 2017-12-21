//(document).ready(function(){
//
//	$.ajax({
//			url:'https://localhost8080/dishes/{id}/dislike'
//	})
//
//)};

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
