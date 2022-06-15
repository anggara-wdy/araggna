function animate() {
    setTimeout(e => {
        document.getElementById("label-name").classList.remove("scale-0");
        document.getElementById("label-name").classList.add("scale-100");

        document.getElementById("label-title").classList.remove("scale-0");
        document.getElementById("label-title").classList.add("scale-100");

        document.getElementById("label-location").classList.remove("scale-0");
        document.getElementById("label-location").classList.add("scale-100");

        document.getElementById("button-contact-me").classList.remove("scale-0");
        document.getElementById("button-contact-me").classList.add("scale-100");
    }, 500);

}
