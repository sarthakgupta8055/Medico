<!--
		TODO :
		Meta description
-->

<!DOCTYPE html><html lang="en-US" dir="ltr"><head><meta charset="utf-8" /><title>Medico</title><meta name="description" content=""/><meta name="author" content="Sarthak Gupta"/><base href="" target="_self"/><meta name="referrer" content="origin-when-cross-origin" /><link rel="icon" type="image/x-icon" href="/resources/favicon.png"/>
<link rel="stylesheet" type="text/css" href="/stylesheets/app.css"/>
<link rel="stylesheet" type="text/css" href="/stylesheets/basic.css"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
<meta name="robots" content="index, follow"><meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
<script src="/scripts/jquery-3.2.1.min.js"></script>
<script src="/scripts/app.js"></script>
<script src="/scripts/medico_auth.js"></script>
<script>
	
	'use strict';

	$(document).ready(() => {
		const ruler = new ScreenRuler();
		const headerH = $('.header').height();
		//set height of main element match the window height - the header element's height
		$('.main').height(ruler.windowH - headerH);
		const auth = new MedicoAuth();
	});

</script>
</head><body>
	<div class="outer-wrapper">
		<!-- This container should have only the fixed/absolute elements which are required out of the flow.
			Make sure to make elements fixed/absolute and to avoid unnecessary overlapping use display: none -->
		<div class="dialog-container fixed w-100 p-1 color-white font-weight-light text-center" style="z-index: 9; display: none;"></div>
	</div>
	<div class="outer-container">
		<div class="header-container">
			<header class="header border-b border-c-4 p-1">
				<a href="/">
					<div class="d-inline-block ml-1" style="vertical-align: -15px;">
						<img src="/resources/favicon-m.png" alt="favicon" width="50px" height="auto">
					</div>
					<div class="d-inline-block ml-1">
						<div class="text-l color-primary">Medico</div>
					</div>
				</a>
			</header>
		</div>
		<div></div>
		<div class="main-container grad-primary-pinch-b pt-5 pl-5 pr-5">
			<main class="main relative w-50 m-auto">
				<div class="section-container">
					<section>
						<div class="card bg-white signup">
							<div class="signup-form">
								<div class="p-1">
									<div class="color-light">Sign Up For Doctor</div>
								</div>
								<div class="bar mb-2"></div>
								<div class="text-center">
									<div class="d-inline-block">
										<input type="text" id="signup-fname" class="p-1 border-b border-c-4" placeholder="First Name">
									</div>
									<div class="d-inline-block mt-1">
										<input type="text" id="signup-mname" class="p-1 border-b border-c-4" placeholder="Middle Name">
									</div>
									<div class="d-inline-block mt-1">
										<input type="text" id="signup-lname" class="p-1 border-b border-c-4" placeholder="Last Name">
									</div>
								</div>
								<div class="text-center">
									<div class="d-inline-block mt-1">
										<input type="text" id="signup-phone" class="p-1 border-b border-c-4" placeholder="Phone">
									</div>
									<div class="d-inline-block mt-1">
										<input type="text" id="signup-email" class="p-1 border-b border-c-4" placeholder="Email">
									</div>
									<div class="d-inline-block mt-1">
										<input type="password" id="signup-passwd" class="p-1 border-b border-c-4" placeholder="Password">
									</div>
								</div>
								<div class="text-center">
									<div class="d-inline-block mt-1">
										<input type="text" id="signup-lic_no" class="p-1 border-b border-c-4" placeholder="License No.">
									</div>
								</div>
								<div class="text-center mt-2 mb-2">
									<button type="button" class="btn-primary signup-btn">Sign Up</button>
								</div>
							</div>
						</div>
					</section>
				</div>
				<div class="section-container mt-5">
					<section>
						<div class="card bg-white login">
							<div class="login-form">
								<div class="p-1">
									<div class="color-light">Log In For Doctor</div>
								</div>
								<div class="bar mb-2"></div>
								<div class="text-center mt-1">
									<input type="text" id="login-contact" class="p-1 border-b border-c-4" placeholder="Phone or Email">
								</div>
								<div class="text-center mt-1">
									<input type="password" id="login-passwd" class="p-1 border-b border-c-4" placeholder="Password">
								</div>
								<div class="text-center mt-2 mb-2">
									<button type="button" class="btn-primary login-btn">Log In</button>
								</div>
							</div>
						</div>
					</section>
				</div>
			</main>
		</div>
	</div>
</body></html>









