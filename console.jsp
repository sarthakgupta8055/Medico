<!--
		TODO :
		Meta description
-->

<!DOCTYPE html><html lang="en-US" dir="ltr"><head><meta charset="utf-8" /><title>Medico</title><meta name="description" content=""/><meta name="author" content="Sarthak Gupta"/><base href="" target="_self"/><meta name="referrer" content="origin-when-cross-origin" /><link rel="icon" type="image/x-icon" href="/resources/favicon.png"/>
<link rel="stylesheet" type="text/css" href="/stylesheets/app.css"/>
<link rel="stylesheet" type="text/css" href="/stylesheets/basic.css"/>
<link rel="stylesheet" type="text/css" href="/stylesheets/console.css"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
<meta name="robots" content="index, follow"><meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
<script src="/scripts/jquery-3.2.1.min.js"></script>
<script src="/scripts/app.js"></script>
<script src="/scripts/medico_auth.js"></script>
</head><body>
	<div class="outer-wrapper">
		<!-- This container should have only the fixed/absolute elements which are required out of the flow.
			Make sure to make elements fixed/absolute and to avoid unnecessary overlapping use display: none -->
		<div class="dialog-container fixed w-100 p-1 color-white font-weight-light text-center" style="z-index: 999; display: none;"></div>
	</div>
	<div class="outer-container">
		<div class="header-container">
			<header class="header border-b border-c-4 fixed w-100 bg-primary-pinch" style="z-index: 99;">
				<div class="d-inline-block cursor-pointer">
					<div class="d-inline-block ml-1" style="vertical-align: -15px;">
						<img src="/resources/favicon-m.png" alt="favicon" width="50px" height="auto">
					</div>
					<div class="d-inline-block ml-1">
						<div class="text-l color-primary">Medico</div>
					</div>
				</div>
				<div class="float-right d-inline-block">
					<div class="mr-1 mt-1 cursor-pointer">
						<i class="fas fa-user-circle color-primary text-xl"></i>
					</div>
				</div>
			</header>
		</div>
		<div class="main-container">
			<main class="main relative overflow">
				<div class="side-nav-container fixed d-flex" style="z-index: 9;">
					<nav class="nav d-flex flex-col overflow w-100 bg-primary-pinch border-r border-c-4">
						<div class="nav-item" style="min-height: 59px;"></div>
						<div class="border-b border-c-4 pl-1 pr-1 pt-3 pb-3 cursor-pointer nav-item">
							<div class="color-light font-weight-normal">
								<i class="fas fa-tachometer-alt color-light mr-1"></i>Dashboard
							</div>
						</div>
						<div class="border-b border-c-4 pl-1 pr-1 pt-3 pb-3 cursor-pointer nav-item">
							<div class="color-light font-weight-normal">
								<i class="fas fa-bong color-light mr-1"></i>Analytics
							</div>
						</div>
						<div class="border-b border-c-4 pl-1 pr-1 pt-3 pb-3 cursor-pointer nav-item">
							<div class="color-light font-weight-normal">
								<i class="fas fa-search color-light mr-1"></i>Explore
							</div>
						</div>
						<div class="border-b border-c-4 pl-1 pr-1 pt-3 pb-3 cursor-pointer nav-item">
							<div class="color-light font-weight-normal">
								<i class="fas fa-database color-light mr-1"></i>User Database
							</div>
						</div>
						<div class="border-b border-c-4 pl-1 pr-1 pt-3 pb-3 cursor-pointer nav-item">
							<div class="color-light font-weight-normal">
								<i class="fas fa-capsules color-light mr-1"></i>Medicine Database
							</div>
						</div>
						<div class="border-b border-c-4 pl-1 pr-1 pt-3 pb-3 cursor-pointer nav-item">
							<div class="color-light font-weight-normal">
								<i class="fas fa-cloud-meatball color-light mr-1"></i>Disease Database
							</div>
						</div>
						<div class="border border-c-4 pl-2 pr-2 pt-2 pb-2 cursor-pointer nav-item absolute w-100" style="bottom: 0;">
							<div class="color-light font-weight-normal text-right">
								<i class="fas fa-chevron-circle-left color-light mr-1 text-l"></i>
							</div>
						</div>
					</nav>
				</div>
				<div class="section-container">
					<section>
						
					</section>
				</div>
			</main>
		</div>
	</div>
</body></html>









