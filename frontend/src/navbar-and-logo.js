
function animated() {
    console.log("Loaded Tst");
    setTimeout(e => {
        document.getElementById("logo-image").classList.remove("scale-0");
        document.getElementById("logo-image").classList.add("scale-100");


    }, 500)
}

function leaveEvent() {
    document.getElementById("logo-image").classList.remove("scale-100");
    document.getElementById("logo-image").classList.add("scale-0");

}