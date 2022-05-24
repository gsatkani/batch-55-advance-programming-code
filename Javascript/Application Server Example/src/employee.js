const ename = document.getElementById('ename')
const esalary = document.getElementById('esalary')
const ecompany = document.getElementById('ecompany')
document.getElementById('employee-list').style.display = 'none'
const url = 'http://localhost:3000/employees'
async function listEmployee() {
    document.getElementById('employee-list').style.display = 'block'
    alert("List Button Clicked")
    let response = await fetch(url, {
        method: 'GET'
    }); // 20 sec to get data

    let data = await response.json();
    let sum = ''
    data.forEach(x => {
        sum = sum +
            `<tr><td>${x.id}</td>
             <td>${x.ename}</td>
             <td>${x.esalary}</td>
             <td>${x.ecompany}</td>
             <td><button onclick=deleteById(${x.id})>Delete</button></td>
         </tr>    
        `
    });
    document.getElementById('list').innerHTML = sum
    console.log(data)
}
async function addEmployee(event) {
    alert("Add Button Clicked")
    alert(`${ename.value} - ${esalary.value} - ${ecompany.value} `)
    let employee = {
        "ename": ename.value,
        "esalary": esalary.value,
        "ecompany": ecompany.value
    }
    let data = await fetch('http://localhost:3000/employees', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(employee)
    });
    console.log(await data.json())
}
async function deleteById(id) {
    let x = url + `/${id}`
    let data = await fetch(x, {
        method: 'DELETE'
    })
    if (data != null) {
        alert('Data Deleted with id ' + id)
    }
}