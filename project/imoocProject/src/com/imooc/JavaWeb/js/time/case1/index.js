function ymd() {
    // 获取yyyy的对象并赋值给yyyy
    var yyyy = document.getElementById("yyyy");
    var mm = document.getElementById("mm");
    var dd = document.getElementById("dd");
    // for (var i = 1999; i < new Date().getFullYear(); i++) {
    //     // options给yyyy添加条目  new Option对一个参数表示显示的名字（尖括号里边的部分），第二个参数才是value的值
    //     yyyy.options.add(new Option(i, i));
    // }
    // for (var i = 1; i <= 12; i++) {
    //     mm.options.add(new Option(i, i));
    // }
    // for (var i = 1; i <= 31; i++) {
    //     dd.options.add(new Option(i, i));
    // }
    initSelect(yyyy, 1999, new Date().getFullYear());
    initSelect(mm, 1, 12);
    initSelect(dd, 1, 31);

    // 使列表显示所有年份中间的值：2011
    var n = yyyy.length;
    yyyy.selectedIndex = Math.round(n / 2);

    // 三级联动
    // 列表框中所有条目设置为0，起到删除的效果
    // dd.options.length = 0;
}

// 给列表框赋值，传递表单元素、开始值、结束值
function initSelect(obj, start, end) {
    for (var i = start; i <= end; i++) {
        obj.options.add(new Option(i, i));
    }
}

// 改变相对月份的天数,对日期三级联动修改
function selectYmd() {
    var yyyy = document.getElementById("yyyy");
    var mm = document.getElementById("mm");
    var dd = document.getElementById("dd");
    var m = parseInt(mm.value);
    // alert(m);
    var dayEnd;
    if (m == 4 || m == 6 || m == 9 || m == 11) {
        dayEnd = 30;
    } else if (m == 2) {
        dayEnd = 28;
        y = parseInt(yyyy.value);
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            dayEnd = 29;
        }
    } else {
        dayEnd = 31;
    }
    dd.options.length = 0;
    initSelect(dd, 1, dayEnd);
}

// 删除列表框的某一个条目。即:按索引号删除
function deleteSelect() {
    var dd = document.getElementById("dd");
    // dd.options.remove(1);
    for (var i = dd.length; i >= 0; i--) {
        dd.options.remove(0);
    }
}

// 完成作业:第二种方法实现年月日的三级联动
function selectYmd2() {
    var yyyy = parseInt(document.getElementById("yyyy").value);
    var mm = parseInt(document.getElementById("mm").value);
    var dd = document.getElementById("dd");
    var day;

    if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
        dd.options.remove(30);
    } else if (mm == 2) {
        dd.options.remove(30);
        dd.options.remove(29);
        if (!((yyyy % 4 == 0 && yyyy % 100 != 0) || yyyy % 400 == 0)) {
            dd.options.remove(28);
        } else {
            initSelect(dd, 29, 29);
        }
    } else {
        dd.options.length = 0;
        initSelect(dd, 1, 31);
    }
}

// 加载图片,初始化加载
function initLogo() {
    var logo = document.getElementById("logo");
    for (var i = 1; i <= 15; i++) {
        logo.options.add(new Option(i, i));
    }
}

// 加载图片，更换图片
function selectLogo() {
    var logo = document.getElementById("logo");
    var logoimg = document.getElementById("img");
    var n = logo.value;
    logoimg.src = "img/" + n + ".gif";
}