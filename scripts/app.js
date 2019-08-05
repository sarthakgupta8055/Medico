
'use strict';

//GLOBAL CONSTANTS
//colors
const COLOR_PRIMARY = '#20C4CB';
const COLOR_PRIMARY_DARK = '#18969A';
const COLOR_PRIMARY_ACCENT = '#072A2C';
const COLOR_PRIMARY_PINCH = '#E9FBFB';
const COLOR_LIGHT = '#9A9A9A';
const COLOR_WHITE = '#FFF';
const COLOR_SUCCESS = '#30A64A';
const COLOR_WARNING = '#FDC02F';
const COLOR_DANGER = '#DA3749';
const COLOR_INFO = '#24A2B7';

/* Screen Ruler */
function ScreenRuler() {
	//get window dimensions
	this.windowH = $(window).height();
	this.windowW = $(window).width();
	//get document dimensions
	this.documentH = $(document).height();
	this.documentW = $(document).width();
};

/* Dialog */
function Dialog(msg,type) {
	this.dialogContainer = $('.dialog-container');
	this.dialogContainer.text(msg);
	switch(type) {
		case 's' : this.dialogContainer.css('background-color', COLOR_SUCCESS); break;
		case 'w' : this.dialogContainer.css('background-color', COLOR_WARNING); break;
		case 'd' : this.dialogContainer.css('background-color', COLOR_DANGER); break;
		case 'i' : this.dialogContainer.css('background-color', COLOR_INFO); break;
		default : this.dialogContainer.css('background-color', COLOR_PRIMARY_DARK);
	}
}

Dialog.prototype.display = function(millisec) {
	this.dialogContainer.show();
	const i = setInterval(() => {
		this.dialogContainer.hide();
		clearInterval(i);
	}, millisec)
}