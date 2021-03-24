function show1(){
    console.log("xingming");
}
function show2(){
    document.getElementById("userName").value="imooc";
}

function show3() {
    var xb = document.getElementsByName("xb");
    var xbTest;
    if (xb[0].checked) {
        xbTest = xb[0].value;
    } else {
        xbTest = xb[1].value;
    }
    alert(xbTest);
}