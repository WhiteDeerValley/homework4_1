
function checkSameTel(ele){
    console.log(ele)
    //this是dom对象，btn是jquery对象
    let url;
    // alert(user);
    url = "/ajax/checkTel";
    let tel = ele.getAttribute("field");
    // alert(id);
    $.ajax({
        url:url,
        type:"GET",
        data:{"tel":tel},
        success: function (result){
            if (result == "only")
            {
                alert("存在相同的电话，请重新输入");
            }
        },
        error: function (jqXHR, textStatus, errorThrown){
            alert('新建或修改错误!');
        }
    })
}
