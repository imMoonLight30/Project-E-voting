function validateRegistration(EnrollmentNo,sname,fname,yearOfJoining,yearOfPassing,currentYear,mobile,email,passwd,branch,dob){
	if (EnrollmentNo.length === 12){
            var part0 = EnrollmentNo.substring(0,1);
            var part1 = EnrollmentNo.substring(1,4);
            var part2 = EnrollmentNo.substring(4,6);
            var part3 = EnrollmentNo.substring(6,12);
         
            if( (part0 === "0") && (isNormalInteger(part1)) && (isString(part2))  && (isNormalInteger(part3)) ){
                if((sname.length >= 5) && (sname.length <= 40)){
                    if(isString(sname)){
                       if(isString(fname)){
                        
                                    if(((yearOfPassing - yearOfJoining) >=4) && ((yearOfPassing - yearOfJoining) <=8)){
                                        
                                                if(mobile.length == 10){
                                                        var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

                                                         if (filter.test(email)) {
                                                                if(passwd.length >=6){
                                                                        if(branch){
                                                                                if(dob){
                                                                                        return true;
                                                                                }
                                                                                else{
                                                                                    alert("Date of Birth field should not be left blank.");
                                                                                    return false;
                                                                                }
                                                                        }
                                                                        else{
                                                                            alert("Branch field should not be left empty.");
                                                                            return false;
                                                                        }
                                                                }
                                                                else{
                                                                    alert("Length of the password should be atleast 6");
                                                                    return false;
                                                                }
                                                          }
                                                          else{
                                                              alert('Please provide a valid email address');
                                                              return false;
                                                          }
                                                }
                                                else{
                                                    alert("Length of mobile number should be 10");
                                                     return false;
                                                    }
                                        
                                    }
                                    else{
                                         alert("Difference between Year of Passing and Year of Joining should be 4 to 8 years only. ");
                                         return false;
                                    }
                               
                      }
                      else{
                          alert("Name should contain only alphabets.");
                          return false;
                      }
                    }
                    else{
                        alert("Name should contain only alphabets.");
                        return false;
                    }
                }
                else{
                    alert("Incorrect Name Length; It should be between [5,40]");
                    return false;
                }
            }
            else{
                alert("Incorrect Enrollment type. Correct type is like 0801XX141007 \n ");                
                return false;
            }
	}
	else{
		alert("Incorrect Enrollment no length. Correct length is 12.");
                return false;
	}
	
}



function validateLogin(EnrollmentNo,passwd){
       
    if(EnrollmentNo.length === 12){
         if((passwd.length >=6) && (passwd.length <=40)){               
                 return true;
            }
            else{
              alert("Length of the password should be between [6,40]");
              return false;
            }

    }
    
    else{
        alert("Enrollment No should have length of 12");
        return false;
    }
}

function isNormalInteger(str) {
    return /^\+?(0|[1-9]\d*)$/.test(str);
}

function isString(str){
    return /^[a-zA-Z]+$/.test(str);
}
function containsAlphDig(str){
   return /^(?=.*\d)(?=.*[a-zA-Z]).{6,40}$/.test(str); 
    
}

function logout(){
    
    
}