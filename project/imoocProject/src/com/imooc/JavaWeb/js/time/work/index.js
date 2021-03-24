function address() {
    var shengfen = document.getElementById("shengfen");
    var shi = document.getElementById("shi");
    shengfen.options.add(new Option("北京市", "beijing"));
    shengfen.options.add(new Option("天津市", "tianjin"));
    shengfen.options.add(new Option("河北省", "hebei"));
    shengfen.options.add(new Option("河南省", "henan"));

    shi.options.add(new Option("朝阳区","chaoyang"));
}

function changeshi(){
    var shengfen = document.getElementById("shengfen");
    var shi = document.getElementById("shi");
    if (shengfen.value == "beijing"){
        shi.options.length = 0;
        shi.options.add(new Option("朝阳区","chaoyang"));
        shi.options.add(new Option("西城区","xicheng"));
    }else if(shengfen.value == "tianjin"){
        shi.options.length = 0;
        shi.options.add(new Option("西青区","xiqing"));
        shi.options.add(new Option("武清区","wuqing"));
    }else if(shengfen.value == "hebei"){
        shi.options.length = 0;
        shi.options.add(new Option("石家庄","shijiazhuang"));
        shi.options.add(new Option("邯郸市","handan"));
    }else if(shengfen.value == "henan"){
        shi.options.length = 0;
        shi.options.add(new Option("郑州市","zhengzhou"));
        shi.options.add(new Option("开封市","kaifeng"));
    }
}