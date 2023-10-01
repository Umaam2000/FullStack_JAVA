Window.onLoad=fnTableAdd();
function fnEven(){
    var x=document.getElementById("lm").value; 
    var y=document.getElementById("um").value;
    var result="";
    for(var i=x;i<=y;i++){
        if(i%2==0){
            result=result+i+" ";
        }
    }
    document.getElementById("result").innerText=result;
}

function fnAdd()
{
    let fn=document.getElementById("fname").value;
    let ln=document.getElementById("lname").value;
    let dt=document.getElementById("dpt").value;
    let data={
        laname:ln,
        dpt1:dt
    }
    var jdata=JSON.stringify(data);
    localStorage.setItem(fn,jdata);
    
}
 function fnTableAdd(){
     let listval={...localStorage};
     var tablelist=document.getElementById("tablebody");
     for(let i in listval)
     {
         let tr=document.createElement('tr');
         tr.appendChild(fnTd(i));
         let val=JSON.parse(listval[i]);
         tr.appendChild(fnTd(val.laname));
         tr.appendChild(fnTd(val.dpt1));
         tablelist.appendChild(tr);
     }
 }
 function fnTd( value){
     let td=document.createElement('td');
     td.textContent=value;
     return td;
 }