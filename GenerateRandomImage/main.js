function randomImageGenerator() {
    for (var index = 0; index < 10; index++) {
        var imageID = Math.floor((Math.random() * 6) + 1);
        // console.log(imageID);
        var imgSrc = "/img/img" + imageID + ".jpg";
        // console.log(imgSrc);
        let imgVar = '<img src = "' + imgSrc + '" style = "width:100px; height:100px;" >';
        // console.log(imgVar);
        document.getElementById("divImage").innerHTML += imgVar;

    }
}
