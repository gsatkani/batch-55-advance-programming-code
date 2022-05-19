function checkEligibility(age) {
    if (age > 18) {
        return true
    }

    if (age < 18) {
        return false
    }
    if (!(typeof age == 'number')) {
        return 'Invalid Age Input, Age Should Only Be Number !!'
    }

}


console.log(checkEligibility('gsat'))