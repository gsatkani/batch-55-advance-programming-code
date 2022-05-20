function valiadate(event) {
    alert("Submit Button Clicked")
    event.preventDefault()
    console.log(event)

    const uname = document.getElementById('username')
    const gender = document.getElementsByName('gender')
    console.log(gender)
    const skills = document.getElementsByName('skills')
    const city = document.getElementById('city')
    if (uname.value == '') {
        alert('Name Should not be Empty')
        uname.focus()
        return false

    }
    let flag = false
    for (let index = 0; index < gender.length; index++) {
        if (gender[index].checked) {
            flag = true;
            break;
        }
    }
    if (flag == false) {
        alert('Select Gender')
        return false
    }
    let status = false
    for (let index = 0; index < skills.length; index++) {
        if (skills[index].checked) {
            status = true;
            break;
        }
    }
    if (status == false) {
        alert('Choose any skills')
        return false
    }

    if (city.selectedIndex == 0) {
        alert("Choose City")
        return false
    }
    alert("Form Submitted")
    return true;
}