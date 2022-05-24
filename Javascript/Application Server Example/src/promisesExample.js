   let flag = false
   let promise = new Promise((resovle, reject) => {

       if (flag == true) {
           resovle('Task is Completed')
       } else {
           reject('Task is Rejected')
       }
   });
   promise.then(sucess => {
       console.log(sucess)
   }).catch(failure => {
       console.log(failure)
   })

   //ES6 syntax

   console.log(promise)
       // 1. pending -> create object for promises

   /*  Task :  Complete the assignment

     Promise -> Complete the assignmet 
     
     1.Fulfilled   2.Rejected  3.Pending
     
     1.give 10 points 
     2. give -10 points   */