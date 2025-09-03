function p1(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>reject("Error in p1"),1000)
    }).catch((err)=>{
        console.error(err);
    })
}


function p2(){
    return new Promise((resolve)=>{
        setTimeout(()=>{
           resolve("p2 resolved")
        },1000)
    })
}

function pAll(){
    Promise.all([p2(),p1()]).then((res)=>{
        console.log("All data resolved",res);
    }).catch((err)=>{
        console.error("Error resolved data",err);
    })
}

pAll();