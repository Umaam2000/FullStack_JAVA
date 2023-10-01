let arr=[10,1,134,135,56,23,1,7,43];
//[10,1,134,135,56,23,1,7,43]
// 0  1  2   3  4  5  6 7 8
console.log(arr);
arr.sort();
// [1,  1, 10, 134, 135,23, 43, 56,   7]
console.log(arr);

let arr1=[10,1,134,135,56,23,1,7,43];
arr1.reverse();
console.log(arr1);
// [43,   7, 1, 23, 56,135, 134, 1, 10]

arr1.shift();
console.log(arr1);
// [7,   1, 23, 56,135, 134,  1, 10]

arr1.unshift(43);
console.log(arr1);
// [43,   7,   1, 23,56, 135, 134,  1,10]

arr1.pop();
console.log(arr1);
// [7,   1, 23, 56,135, 134,  1]

arr1.push(10);
console.log(arr1);
// [43,   7, 1, 23, 56,135, 134, 1, 10]

arr1.splice(3,2);
console.log(arr1);
// [43, 7,  1, 135,134, 1, 10]

arr2=arr1.slice(2,6);
console.log(arr2);
// [ 1, 135, 134, 1 ]

arr2.sort((a,b)=>(a-b));
console.log(arr2);
// [ 1, 1, 134, 135 ]

 let x=arr2.indexOf(13);
console.log(x);
// -1

let arr3=arr1.join(arr2);
console.log(arr3);
// arr1=[43, 7,  1, 135,134, 1, 10]
// arr2=[ 1, 1, 134, 135 ]
//arr3=431,1,134,13571,1,134,13511,1,134,1351351,1,134,1351341,1,134,13511,1,134,13510

let m=["A","B","C","D"];
let n=["E","F","G","H"];
let jin=m.join(n);
let ccat=m.concat(n);
console.log(ccat);
// ['A', 'B', 'C','D', 'E', 'F','G', 'H']

console.log(arr1.toString());
//43,7,1,135,134,1,10

let s="hello welcome to oOty nice to meet you u";
str=s.match("ooty");
console.log(str);
// ['ooty',index: 17,input: 'hello welcome to ooty nice to meet you u',groups: undefined]

str=s.substring(2,9);
console.log(str);
//llo wel -> select 2 to 8 index positions

str=s.substr(2,9);
console.log(str);
//llo welco -> select 9 index positions from 2

str=s.search(/ooty/); // can use "" instead of // also
console.log(str);
//17

str=s.replace("oOty","Banglur"); // can use "" instead of // also
console.log(str);
//hello welcome to Banglur nice to meet you u

str=s.toLocaleLowerCase();
console.log(str);
// hello welcome to ooty nice to meet you u
str=s.toLowerCase();
console.log(str);
// hello welcome to ooty nice to meet you u

str=s.toLocaleUpperCase();
console.log(str);
// HELLO WELCOME TO OOTY NICE TO MEET YOU U
str=s.toUpperCase();
console.log(str);
// HELLO WELCOME TO OOTY NICE TO MEET YOU U

console.log(s.length);
//40

str=s.slice(2,9);
console.log(str);
//llo wel

str=s.split("");
console.log(str);
// ['h', 'e', 'l', 'l', 'o', ' ', 'w','e', 'l', 'c', 'o', 'm', 'e', ' ','t', 'o', ' ', 'o', 'O', 't', 'y',' ', 'n', 'i', 'c', 'e', ' ', 't','o', ' ', 'm', 'e', 'e', 't', ' ','y', 'o', 'u', ' ', 'u']
console.log(str.toString());
//h,e,l,l,o, ,w,e,l,c,o,m,e, ,t,o, ,o,O,t,y, ,n,i,c,e, ,t,o, ,m,e,e,t, ,y,o,u, ,u

console.log(Math.ceil(12.345));
//13
console.log(Math.floor(12.345));
//12
console.log(Math.round(12.345));
//12 above or equal .5 act like ceil else floor
console.log(Math.abs(12.5345));
//12.345

arr1=[10,1,134,135,56,23,1,7,43];
console.log(Math.max(10,1,134,13.5,56,23,1,7,43));
//135
console.log(Math.max(...arr1));
//135
console.log(Math.min(...arr1));
//1

console.log(Math.pow(2,3));
//2*2*2=8
console.log(Math.sqrt(16));
//4

console.log(Math.ceil(1.2,3.4,5.6));
//2 only the first element ceiled

today=(new Date);
console.log(today);
//2023-06-14T12:12:21.028Z
console.log(today.getDay());
//3 means wednesday 0-6=>sun-sat
console.log(Date.parse(today.toString()));
//1686801322000
console.log(Date(Date.parse(today.toString())));
//Thu Jun 15 2023 09:25:22 GMT+0530 (India Standard Time)
console.log(Date.parse("15 Jun 2023 09:26:00 GMT+0530"));
//1686801360000
console.log(today.getDay());
//4 thursday
console.log(today.getDate());
//15
console.log(today.getFullYear());
//2023

arr1.forEach(function(num){
    console.log("num="+num);
});
// num=10 num=1 num=134 num=135 num=56 num=23 num=1 num=7 num=43

for(let x in arr1){
    console.log("num="+x);
}
//give index values
for(let x of arr1){
    console.log("num="+x);
}
//give values

 x="  hiii       ";
console.log(x.trim());

console.log(s);
s=s.split("");
console.log(s);