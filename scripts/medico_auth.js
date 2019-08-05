/*

TODO:
VALIDATION

*/

'use strict';

//THIS SCRIPT CREATES | LOGS IN | LOGS OUT USERS

function MedicoAuth() {
	//check if user already logged in
	$.get('GetUserStatus', (res) => {
		console.log(res);
	});
	//get handle to dom elements
	//sign up
	this.sfname = $('#signup-fname');
	this.smname = $('#signup-mname');
	this.slname = $('#signup-lname');
	this.sphone = $('#signup-phone');
	this.semail = $('#signup-email');
	this.spasswd = $('#signup-passwd');
	this.slicNo = $('#signup-lic_no');
	this.sbtn = $('.signup-btn');
	//log in
	this.lcontact = $('#login-contact'); //email|phone
	this.lpasswd = $('#login-passwd');
	this.lbtn = $('.login-btn');
	//setup event listeners
	this.sbtn.click(() => {
		if(this.signupValidate()) {
			//create user
			const user = {
				fname : this.sfname.val().trim(),
				mname : this.smname.val().trim(),
				lname : this.slname.val().trim(),
				phone : this.sphone.val().trim(),
				email : this.semail.val().trim(),
				passwd : this.spasswd.val().trim(),
				licNo : this.slicNo.val().trim()
			};
			$.post('DocSignUp',$.param(user),(res) => {
				console.log(res);
			});
		}
	});
	/*this.lbtn.click(() => {
		if(this.loginValidate()) {
			//login
			const data = {
				uid : 
			}
		}
	});*/
};

MedicoAuth.prototype.signupValidate = function() {
	//store the values
	const fname = this.sfname.val().trim();
	const mname = this.smname.val().trim();
	const lname = this.slname.val().trim();
	const phone = this.sphone.val().trim();
	const email = this.semail.val().trim();
	const passwd = this.spasswd.val().trim();
	const licNo = this.slicNo.val().trim();

	//is empty
	if(!fname) {
		this.dialog = new Dialog("First Name Required",'d');
	}
	else if(!phone) {
		this.dialog = new Dialog("Phone Number Required",'d');
	}
	else if(!passwd) {
		this.dialog = new Dialog("Password Required",'d');
	}
	else if(!licNo) {
		this.dialog = new Dialog("License Number Required",'d');
	}
	this.dialog.display(3000);
};

MedicoAuth.prototype.loginValidate = function() {
	//store the values
	const contact = this.lcontact.val().trim();
	const passwd = this.lpasswd.val().trim();

	//is empty
	if(!contact) {
		this.dialog = new Dialog("Email Or Phone Required",'d');
	}
	if(!passwd) {
		this.dialog = new Dialog("Password Required",'d');
	}
	this.dialog.display(3000);
}



















