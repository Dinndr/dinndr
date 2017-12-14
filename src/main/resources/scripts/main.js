//function viewMore() {
//	var x = document.querySelector(".info");
//	if (x.style.display === "none") {
//		x.style.display = "block";
//	} else {
//		x.style.display = "none";
//	}
//};
//
//function nextPlease() {
//	var x = document.querySelector(".next");
//	if (x.style.display === "none") {
//		x.style.display = "block";
//	} else {
//		x.style.display = "none";
//	}
//};

//var image, imageNumber;
//
//function ( {
//	
//})

//pure JS
//var elem = document.getElementById('mySwipe');
//window.mySwipe = Swipe(elem, {
//  // startSlide: 4,
//  // auto: 3000,
//  continuous: true,
//  // disableScroll: true,
//  // stopPropagation: true,
//  // callback: function(index, element) {},
//  // transitionEnd: function(index, element) {}
//});
var sentence = new Array()
sentence[0] = "Saab is driven by smart people."
sentence[1] = "Volvo is an automobile."
sentence[2] = "BMW is for the rich and famous."
sentence[3] = "Ford is for the economy minded."

var intSentenceIndex = 0;


function writeThing() {
    if ( intSentenceIndex == sentence.length ) intSentenceIndex = 0;
    document.getElementById('mySentence').innerHTML = sentence[intSentenceIndex];
    intSentenceIndex++;
}

var image = new Array()
image[0] = "/images/acre-bbq-pork-sandwich.jpg"
image[1] = "/images/cc-chicken.jpg"
image[2] = "/images/ev-xangos-cheesecake.jpg"
image[3] = "/images/ray-scratch-mac-n-cheese.jpg"

var intIMageIndex = 0;


function displayImage() {
    if ( intImageIndex == image.length ) intImageIndex = 0;
    document.getElementById('myImage').innerHTML = image[intImageIndex];
    intImageIndex++;
}