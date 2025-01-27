//Menu Section
document.querySelector("p#weather").addEventListener("click",function(){
    document.querySelector("p#weather").innerHTML="Text";
});

document.querySelector("#open-nav-menu").addEventListener("click",function(){
    document.querySelector("header nav .wrapper").classList.add("nav-open")
});

document.querySelector("#close-nav-menu").addEventListener("click",function(){
    document.querySelector("header nav .wrapper").classList.remove("nav-open")
});

//Greeting Section

function celsiusToFahr(temperature){
    let fahr =(temperature * 9/5)+32;
    return fahr;
}

const greeting = "Good Morning!";
const weather = "sunny";
const userLocation = "Chennai";
let temperature = 36;

let fahrText = `The weather is ${weather} in ${userLocation} and it's ${celsiusToFahr(temperature)}°F outside.`
let celText = `The weather is ${weather} in ${userLocation} and it's ${temperature}°C outside.`

 document.querySelector("#greeting").innerHTML=greeting;
document.querySelector("p#weather").innerHTML=celText;

document.querySelector(".weather-group").addEventListener("click",function(e){
    
    if(e.target.id == "celsius"){
        document.querySelector("p#weather").innerHTML=celText;
    }else if(e.target.id == "fahr"){
        document.querySelector("p#weather").innerHTML=fahrText;
    }
});


setInterval(function(){
    let localTime = new Date();

    document.querySelector("span[data-time=hours]").textContent = localTime.getHours().toString().padStart(2,"0");
    document.querySelector("span[data-time=minutes]").textContent = localTime.getMinutes().toString().padStart(2,"0");
    document.querySelector("span[data-time=seconds]").textContent = localTime.getSeconds().toString().padStart(2,"0");

},1000)

//Gallary

//src="./assets/gallery/image1.jpg" alt="Thumbnail Image 1"

const galleryImage = [
    {
        src : "./assets/gallery/image1.jpg",
        alt : "Thumbnail Image 1"
    },
    {
        src : "./assets/gallery/image2.jpg",
        alt : "Thumbnail Image 2"
    },
    {
        src : "./assets/gallery/image3.jpg",
        alt : "Thumbnail Image 3"
    }
]

let mainImage = document.querySelector("#gallery > img");
mainImage.src = galleryImage[0].src;
mainImage.alt = galleryImage[0].alt;

let thumbnails = document.querySelector("#gallery .thumbnails");


galleryImage.forEach(function(image,index){
    let thumb = document.createElement("img");
    thumb.src = image.src;
    thumb.alt = image.alt;
    thumb.dataset.arrayIndex = index;
    thumb.dataset.selected = false;
    thumbnails.appendChild(thumb);
})