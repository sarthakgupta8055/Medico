
'use strict';

//THIS SCRIPT CREATES | LOGS IN | LOGS OUT USERS

function MedicoAuth(autoLogIn) {
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
		this.signupValidate();
	});
};

Auth.prototype.signupValidate = function() {
	
};