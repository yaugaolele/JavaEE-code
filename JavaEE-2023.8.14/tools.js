// 在js中写
// alert("hello tools")

// 我是单行注释
/*
    我是多行注释
    我是多行注释
 */
// 输入输出
/*
输入：prompt
弹出一个对话框
*/
// prompt("请输入您的姓名：")
/*
输出：alert
弹出一个警示对话框，输出结果
*/
// alert("输入成功！")

/**
 * 输出：console.log
 * 在控制台打印一个日志(供程序员看)
 */
// console.log("这是一条日志！")

// 变量的定义

// var name = "张三";
// var age = 20;

// 变量的使用
// alert(name);

// 动态类型的理解
// var a = 10;
// var b = "hello";

// var c = 'world';
// c = 30;

// var max = Number.MAX_VALUE;
// console.log(max);
// console.log(-max);
// console.log(max - 'hello');

// 求长度
// var str = "hello";
// console.log(str.length);

//字符串拼接
// var a = "hello ";
// var b = "world";
// console.log(a + b);

// var a = 100;
// var b = 200;
// var c = "300";
// console.log(a + b);
// console.log(b + c);

// var a;
// console.log(a);
// console.log(a + 10);
// console.log(a + "10");

// var b = null;
// console.log(b);
// console.log(b + 10);
// console.log(b + "10");

// console.log(true + 10);
// console.log(false + 10);

// var num1 = 10;
// var num2 = "10";
// console.log("==隐式类型比较结果：" + (num1 == num2));
// console.log("===严格类型比较结果：" + (num1 === num2));

//判断某年是否是闰年
// var year = 2000;
// if(year % 100 == 0) {
//     //判定世纪闰年
//     if(year % 400 == 0) {
//         console.log("是闰年");
//     } else{
//         console.log("不是闰年");
//     }
// }else{
//     //普通闰年
//     if(year % 4 == 0) {
//         console.log("是闰年");
//     }else{
//         console.log("不是闰年");
//     }
// }


// console.log(2 > 1 ? "yes" : "no");

// var day = prompt("请输入今天星期几: ");
//         switch (parseInt( day)) {
//             case 1:
//                 console.log("星期一");
//                 break;
//             case 2:
//                 console.log("星期二");
//                 break;
//             case 3:
//                 console.log("星期三");
//                 break;
//             case 4:
//                 console.log("星期四");
//                 break;
//             case 5:
//                 console.log("星期五");
//                 break;
//             case 6:
//                 console.log("星期六");
//                 break;
//             case 7:
//                 console.log("星期日");
//                 break;
//             default:
//                 console.log("输入有误");
//         }

// var array = new Array();
// array.push(1);
// array.push("hello");
// array.push("world");
// // 第一种
// for (let i = 0; i < array.length; i++) {
//     const element = array[i];
//     console.log(element);
// }

// // 第二种
// for (const item of array) {
//     console.log(item);
// }

//找到100-200中第一个3的倍数
// var num = 100;
// while (num <= 200) {
//     if (num % 3 == 0) {
//         console.log("找到了 3 的倍数, 为:" + num);
//         break;
//     }
//     num++;
// }

// var arr = new Array();

// var array1 = [];
// var array2 = [1,2,"hello", false];//数组中保存的内容称之为元素
// console.log(array2[2]);

//通过修改length新增
// var arr = [9,8,7,4];
// arr.length = 7;
// console.log(arr);
// console.log(arr[4], arr[5]);
// console.log("=====================");
// //通过下标新增
// arr[9] = 10;
// console.log(arr);
// console.log("=====================");
// //使用push来进行追加元素
// var newArr = [];
// for (let i = 0; i < arr.length; i++) {
//     if(arr[i] % 2 != 0) {
//         newArr.push(arr[i]);
//     }
// }
// console.log(newArr);

// var arr = [9,2,4,5,8];
// arr.splice(2,1);//第一个参数表示从下标为2开始删除，第二个参数表示要删除的元素个数是1个
// console.log(arr);


//创建函数/函数声明/函数的定义
// function 函数名(形参列表) {
//     函数体
//     return 返回值;
// }

// function hello() {
//     console.log("hello");
// }
// hello();


// var add = function() {
//     var sum = 0;
//     for (let i = 0; i < 10; i++) {
//         sum += i; 
//     }
//     return sum;
// }
// console.log(add());


//全局变量
// var num = 10;
// console.log(num);
// function test() {
//     //局部变量
//     var num = 20;
//     console.log(num);
// }
// function test2() {
//     //局部变量
//     var num = 30;
//     console.log(num);
// }
// test();
// test2();
// console.log(num);

// var a = {};//此时创建了一个空对象
// var student = {
//     name: '张三',
//     height: 130,
//     weight: 170,
//     sayHello: function() {
//         console.log("hello");
//     }
// };

// console.log(student.name);
// console.log(student["height"]);
// student.sayHello();


// var student = new Object();
// student.name = "李四";
// student.height = 180;
// student['weight'] = 130;
// student.sayHello = function() {
//     console.log("hello");
// }

// console.log(student.name);
// console.log(student['weight']);
// student.sayHello();

// var mimi = {
//         name: "咪咪",
//         type: "中华田园喵",
//         miao: function () {
//             console.log("喵");
//         }
//    };
// var xiaohei = {
//     name: "小黑",
//     type: "波斯喵",
//     miao: function () {
//         console.log("猫呜");
//     }
// }
// var ciqiu = {
//     name: "刺球",
//     type: "金渐层",
//     miao: function () {
//         console.log("咕噜噜");
//     }
// }

function Cat(name, type, sound) {
    this.name = name;
    this.type = type;
    this.miao = function() {
        console.log(sound);
    }
}

var mimi = new Cat('咪咪','中华田园猫','喵');
var xaiohei = new Cat('小黑','波斯猫','喵喵');
var ciqiu = new Cat('刺球','金渐层','咕噜噜');
console.log(mimi);
mimi.miao();