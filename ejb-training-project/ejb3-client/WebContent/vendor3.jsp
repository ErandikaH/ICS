<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Inventory Control System</title>

		<meta name="description" content="Dynamic tables and grids using jqGrid plugin" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="assets/font-awesome/4.2.0/css/font-awesome.min.css" />

		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="assets/css/jquery-ui.min.css" />
		<link rel="stylesheet" href="assets/css/datepicker.min.css" />
		<link rel="stylesheet" href="assets/css/ui.jqgrid.min.css" />
		<link rel="stylesheet" href="assets/css/myfieldset.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="assets/fonts/fonts.googleapis.com.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
		<![endif]-->

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->
		<script src="assets/js/ace-extra.min.js"></script>

		<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

		<!--[if lte IE 8]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body class="no-skin">
		<div id="navbar" class="navbar navbar-default">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
					<span class="sr-only">Toggle sidebar</span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>
				</button>

				<div class="navbar-header pull-left">
					<a href="index.html" class="navbar-brand">
						<small>
							<i class="fa fa-leaf"></i>
							User Admin
						</small>
					</a>
				</div>

				<div class="navbar-buttons navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
						


						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="assets/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>Welcome,</small>
									Admin User
								</span>

								<i class="ace-icon fa fa-caret-down"></i>
							</a>

							<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">

								<li>
									<a href="profile.html">
										<i class="ace-icon fa fa-user"></i>
										Profile
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="#">
										<i class="ace-icon fa fa-power-off"></i>
										Logout
									</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
			</div><!-- /.navbar-container -->
		</div>

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div id="sidebar" class="sidebar                  responsive">
				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
				</script>


				<ul class="nav nav-list">
					<li class="">
						<a href="ui_1.html">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text"> Admin </span>
						</a>

						<b class="arrow"></b>
					</li>

					
					<li class="">
						<a href="#">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> Item </span>
						</a>

						<b class="arrow"></b>
					</li>
					
					<li class="">
						<a href="#">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> User </span>
						</a>

						<b class="arrow"></b>
					</li>
					
					<li class="">
						<a href="#">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> Category </span>
						</a>

						<b class="arrow"></b>
					</li>
					
					<li class="">
						<a href="#">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> Invoice </span>
						</a>

						<b class="arrow"></b>
					</li>
					
					<li class="">
						<a href="#">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> Payment </span>
						</a>

						<b class="arrow"></b>
					</li>
					
					<li class="">
						<a href="ui_1.html">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> Vendor </span>
						</a>

						<b class="arrow"></b>
					</li>
					
					
				</ul><!-- /.nav-list -->

				<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
					<i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
				</div>

				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
				</script>
			</div>

			<div class="main-content">
				<div class="main-content-inner">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="ace-icon fa fa-home home-icon"></i>
								<a href="#">Home</a>
							</li>

							<li>
								<a href="#">Vendor</a>
							</li>
							<li class="active"></li>
						</ul><!-- /.breadcrumb -->

					</div>

					<div class="page-content">
						<div class="ace-settings-container" id="ace-settings-container">
							<div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
								<i class="ace-icon fa fa-cog bigger-130"></i>
							</div>

							<div class="ace-settings-box clearfix" id="ace-settings-box">
								<div class="pull-left width-50">
									<div class="ace-settings-item">
										<div class="pull-left">
											<select id="skin-colorpicker" class="hide">
												<option data-skin="no-skin" value="#438EB9">#438EB9</option>
												<option data-skin="skin-1" value="#222A2D">#222A2D</option>
												<option data-skin="skin-2" value="#C6487E">#C6487E</option>
												<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
											</select>
										</div>
										<span>&nbsp; Choose Skin</span>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
										<label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
										<label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
										<label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
										<label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
										<label class="lbl" for="ace-settings-add-container">
											Inside
											<b>.container</b>
										</label>
									</div>
								</div><!-- /.pull-left -->

								<div class="pull-left width-50">
									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover" />
										<label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact" />
										<label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight" />
										<label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
									</div>
								</div><!-- /.pull-left -->
							</div><!-- /.ace-settings-box -->
						</div><!-- /.ace-settings-container -->

						

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								
								<div class="alert alert-block alert-success">
									
									<div class="row">
									
										<div class="col-xs-12">
										<div class="col-md-4"><label for="vendorName" style="margin-left:10px;">Vendor Name:</label>
										<input type="text" id="vendorName" name="vendorName" style="margin-left:20px;"/></div>
										<div class="col-md-8">
										<div class="col-md-2">
										<label for="rateType" class="control-label no-padding-right">Rate Type:</label></div>
										<div class="col-md-3">
										<s:select id="rateType" class="form-control"
											                        headerKey="-1" headerValue="Select Rate Type"
											                        list="{'Select Rate Type'}" /></div>
										
										<div class="col-md-2"><label for="rateLevel" >Rate Level:</label></div>
										<div class="col-md-3">
										<s:select id="rateLevel" class="form-control"
											                        headerKey="-1" headerValue="Select Rate Level"
											                        list="{'Select Rate Level'}" /></div>
										<div class="col-md-2">
										<button type="button" id="myButton" name="myButton" onclick="searchFun();" class="btn btn-purple btn-sm pull-right">
											<span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
											Search
										</button></div>
										</div>						
										</div>
									
									
									</div>					

								</div>
								
								
								<div class="row">
								
								<div class="hr hr32 hr-dotted" style="
								    margin-top: 5px;
								    margin-bottom: 5px;
								"></div>
									<div class="col-xs-12">
											

											<div class="widget-body">
												<div class="col-xs-12">
										<table id="grid-table"></table>

												<div id="grid-pager"></div>
										</div><!-- /.widget-main -->
											</div><!-- /.widget-body -->
										
									</div><!-- /.col -->

								</div><!-- /.row -->

								<div id="dialog-4" title="Confirm">Do you want to add this?</div>
								<div id="dialog-4-update" title="Confirm">Do you want to save this?</div>
								<div id="dialog-4-delete" title="Delete Confirmation">Are you sure you want to delete this?</div>
								<div id="dialog-4-addRate" title="Confirm">Do you want to add this?</div>
								<div id="dialog-4-updateRate" title="Confirm">Do you want to save this?</div>
								<div class="hr hr32 hr-dotted" style="
								    margin-top: 10px;
								    margin-bottom: 0px;
								    border-top-width: 1px;
								"></div>
								<div class="row">
									<div class="col-xs-12">
		
											<div class="widget-body">
												
													<div class="col-sm-6" id="default-buttons">
														<br>		
																	<button class="btn btn-white btn-info btn-bold" id="addButton" onclick="enableAddButton(this.id)">
												<i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
												Add 
											</button>
											&nbsp; &nbsp; &nbsp;
											<button class="btn btn-white btn-warning btn-bold"  id="updateButton" onclick="enableEditButton(this.id)" disabled>
																		<i class="ace-icon fa fa-pencil align-top bigger-125"></i>
																		Edit
																	</button>
																	&nbsp; &nbsp; &nbsp;
											<button class="btn btn-white btn-warning btn-bold"  id="deleteButton" onclick="enableDeleteButton(this.id)" disabled>
												<i class="ace-icon fa fa-trash-o bigger-120 orange"></i>
												Delete
											</button>
											<input type="hidden" id="myText" name="myText">
											
												</div><!-- /.widget-main -->
											</div><!-- /.widget-body -->
										
									</div><!-- /.col -->

								</div><!-- /.row -->
								
								<div class="hr hr32 hr-dotted" style="
								    margin-top: 10px;
								    margin-bottom: 10px;
								    
								"></div>

								<div class="row">
								
								
									<div class="col-sm-6">
									<div class="widget-box transparent" id="recent-box">
									<div class="widget-header">
										<h4 class="widget-title lighter smaller">
											<i class="ace-icon fa fa-rss orange"></i>Details
										</h4>
										 <div id="successAlert"></div>
				
										</div>
										<div class="tabbable">
											<ul class="nav nav-tabs padding-12 tab-color-blue background-blue" id="myTab4">
												<li class="active">
													<a data-toggle="tab" href="#member-tab">Vendor Detail</a>
												</li>

												<li>
													<a data-toggle="tab" href="#comment-tab">Vendor Rates</a>
												</li>

											</ul>

											<div class="tab-content">
												<div id="member-tab" class="tab-pane in active">
													<div class="row">
					
															<input type="hidden" id="vendorId" name="vendorId"><br>
															<div class="col-xs-6">
															<fieldset class="scheduler-border">
													            <legend class="scheduler-border">Primary Contact Details</legend>
													
													            <div class="form-group required" style="margin-bottom: 1px;">
																	<label class="col-md-4 control-label no-padding-right" for="primaryContactName"> Contact Name: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="primaryContactName" name="primaryContactName" placeholder="Primary Contact Name" class="col-xs-10 col-sm-5" disabled/>
																		<div id="nameFail"><br>
																	 <p><font color="red">Please enter your name.</font></p>
																	     
																	  </div>
																	</div>
																	
																	
																</div>
																<br><br>
																<div class="form-group required" style="margin-bottom: 1px;">
																	<label class="col-md-4 control-label no-padding-right" for="primaryContactMobile"> Mobile:</label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="primaryContactMobile" name="primaryContactMobile" placeholder="Primary Contact Mobile" class="col-xs-10 col-sm-5" disabled/>
																		<div id="mobileFail"><br>
																	 <p><font color="red">Please enter your mobile number.</font></p>
																	     
																	  </div>
																	</div>
																</div>
																<br><br>
																<div class="form-group required" style="margin-bottom: 1px;">
																	<label class="col-md-4 control-label no-padding-right" for="primaryContactEmail"> Email:</label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="primaryContactEmail" name="primaryContactEmail" placeholder="Primary Contact Email" class="col-xs-10 col-sm-5" disabled/>
																		<div id="emailFail"><br>
																	 <p><font color="red">Please enter your email address.</font></p>
																	     
																	  </div>
																	</div>
																</div>
													        </fieldset>
															
															
															</div>
															
															<div class="col-xs-6">
															
															<fieldset class="scheduler-border">
													            <legend class="scheduler-border">Secondary Contact Details</legend>
													
													            <div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="secondaryContactName">Contact Name: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="secondaryContactName" name="secondaryContactName" placeholder="Secondary Contact Name" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="secondaryContactMobile">Mobile: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="secondaryContactMobile" name="secondaryContactMobile" placeholder="Secondary Contact Mobile" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="secondaryContactEmail">Email: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="secondaryContactEmail" name="secondaryContactEmail" placeholder="Secondary Contact Email" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
													        </fieldset>
															
															
															</div></div>
															<div class="row">
															<div class="col-xs-6">
															
															<fieldset class="scheduler-border">
													            <legend class="scheduler-border">Address</legend>
													
													            <div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="address"> Address1: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="address" name="address" placeholder="Address" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="address"> Address2: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="address2" name="address2" placeholder="Address" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="address"> Address3: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="address3" name="address3" placeholder="Address" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="address"> Address4: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="address4" name="address4" placeholder="Address" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
							
													        </fieldset>
															
															
															</div>
															
															
															<div class="col-xs-6">
															
															<fieldset class="scheduler-border">
													            <legend class="scheduler-border">Other</legend>
													
													            <div class="form-group required" style="margin-bottom: 1px;">
																	<label class="col-md-4 control-label no-padding-right" for="companyName"> Company Name: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="companyName" name="companyName" placeholder="Company Name" class="col-xs-10 col-sm-5" disabled/>
																		<div id="companyFail"><br>
																	 <p><font color="red">Please enter the company name.</font></p>
																	     
																	  </div>
																	</div>
																</div>
																<br><br>
																
																
																<div class="form-group" style="margin-bottom: 1px;">
																	<label class="col-md-4 control-label no-padding-right" for="telephone"> Telephone: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="telephone" name="telephone" placeholder="Telephone" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="fax"> Fax: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="fax" name="fax" placeholder="Fax" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>																
																<br><br>
																
																
																
																<div class="form-group" style="margin-bottom: 0px;">
																		
																	<label class="col-md-4 control-label no-padding-right" for="registrationDate">Registration Date:</label>

													
																	<!-- <div class="col-xs-8 col-sm-11"> -->
																	<div class="col-md-6">
																		<div class="input-group">
																			<input class="form-control date-picker" id="registrationDate" name="registrationDate" placeholder="dd-mm-yyyy"type="text" data-date-format="dd-mm-yyyy" disabled/>
																			<span class="input-group-addon">
																				<i class="fa fa-calendar bigger-110"></i>
																			</span>
																		</div>
																	</div>
														
																<div class="space space-8"></div>
																</div>
							
													        </fieldset>
															
															
															</div></div>

															<div class="row">
															<div class="col-xs-6">
															
															<fieldset class="scheduler-border">
													            <legend class="scheduler-border">Remark</legend>
													
													            <div class="form-group" style="margin-bottom: 0px;">
																
																
																<div>
																	<label class="col-md-4 control-label no-padding-right" for="remarkVendor">Remark:</label>
																	<div class="col-md-8">
																		<textarea id="remarkVendor" style="width:100%" name="remarkVendor" placeholder="Remark" class="autosize-transition form-control" disabled></textarea>
																	</div>
																	
																</div></div>
																
													        </fieldset>
															
															
															</div>
			
																<div class="col-xs-6">
															
																<!-- <button class="btn btn-info" id="addVendor" onclick="addRow();" style="float: right; margin-top: 55px;" disabled>
															<!-- <button class="btn btn-info" id="addVendor" type="submit" formaction="addVendor" disabled>
																<i class="ace-icon fa fa-floppy-o bigger-120 blue"></i> 
																Add
															</button>-->
															<button class="btn btn-info" id="addVendor" onclick="addVendor();" style="float: right; margin-top: 55px;">
															<!-- <button class="btn btn-info" id="addVendor" type="submit" formaction="addVendor" disabled> -->
																<i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
																Save
															</button>
														
																
																</div>
																
															</div>
																
												</div>

												<div id="comment-tab" class="tab-pane">
													<div class="row">
													
									<div class="col-xs-7">
										
										<div class="clearfix">
											<div class="pull-right tableTools-container"></div>
										</div>
										<div class="table-header">
											Results for "Latest Rates"
										</div>

										<!-- div.table-responsive -->

										<!-- div.dataTables_borderWrap -->
										<div>
											<table id="dynamic-table" class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														
														<th>ID</th>
														<th>Date</th>
												
														<th>Rate Type</th>

														<th>
															
															Rate Level
														</th>
													

													
													</tr>
												</thead>

												<tbody>	
												</tbody>
											</table>
										</div></div>

									<div class="row">
										<div class="col-xs-5">
										
											<div class="widget-box">
												<div class="widget-header">
													<h4 class="widget-title">Vendor Rate Details</h4>

													<span class="widget-toolbar">
														
														
													</span>
												</div>

												<div class="widget-body">
													<div class="widget-main">
													<input type="hidden" id="rateId" name="rateId"><br>
														<input type="hidden" id="comName" name="comName"><br>
														<div class="form-group required">
																	<label class="col-md-5 control-label no-padding-right" for="rateType"> Rate Type </label>

																	<div class="col-md-7">
																		<s:select id="dropdown1" class="form-control"
											                        headerKey="-1" headerValue="Select Rate Type"
											                        list="{'Select Rate Type'}" disabled="true"/>
											                        <div id="dropdown1Fail">
																	 <p><font color="red">Please select a rate type.</font></p>
																	     
																	  </div>
																	</div>
																</div>
														
														<div class="space space-8"></div>
														<hr/>
														<div class="form-group required">
																	<label class="col-md-5 control-label no-padding-right" for="rateLevel"> Rate Level </label>

																	<div class="col-md-7">
																		<s:select id="dropdown2" class="form-control"
												                        headerKey="-1" headerValue="Select Rate Level"
												                        list="{'Select Rate Level'}" disabled="true"/>
												                        <div id="dropdown2Fail">
																		 <p><font color="red">Please select a rate level.</font></p>
																		     
																		  </div>
																	</div>
																	
																	</div>
																</div>
														
														<div class="space space-8"></div>
														<hr/>
													
														<div class="form-group">
																	<label class="col-md-5 control-label no-padding-right" for="remark"> Remark </label>

																	<div class="col-md-7">
																		<textarea id="remark" name="remark" placeholder="Remark" class="autosize-transition form-control" disabled></textarea>
																	</div>
																</div>
														<hr />
														<div class="space space-8"></div>
								
														<hr />
														
											
															<div class="row">
																<div class="col-sm-6" style="margin-bottom: 10px; margin-right: 10px">
																<p>
																	<!-- <button class="btn btn-minier btn-purple" type="submit" formaction="addVendorRateType" id="addRate" disabled>-->
																	
																	<button class="btn btn-minier btn-purple" id="addRate" onclick="addRowToRateTable();" style="float: right; padding-right:20px; margin-left: 10px; margin-right: 10px" disabled>
																		<i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
																				Add
																	</button>
																	
																	<button class="btn btn-minier btn-purple" id="updateRate" onclick="updateRateButton();" style="float: right; padding-right:20px; " disabled>
																		<i class="ace-icon fa fa-pencil bigger-120 blue"></i>
																				Update
																	</button>
																
																				
																</p>

																</div>
															</div>
														
													</div>
												</div>
											</div>
										
										</div><!-- /.span -->
										</div>
								
										
										</div>
												</div>

											</div>
										</div>
										
																
										</div>
									</div><!-- /.col -->
								</div><!-- /.col -->

								</div><!-- /.row -->
								<script type="text/javascript">
									var $path_base = ".";//in Ace demo this will be used for editurl parameter
								</script>

								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div>
			</div><!-- /.main-content -->

			<div class="footer">
				<div class="footer-inner">
					<div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">ICS</span>
							Application &copy; 2015-2016
						</span>

						&nbsp; &nbsp;
						<span class="action-buttons">
							<a href="#">
								<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-rss-square orange bigger-150"></i>
							</a>
						</span>
					</div>
				</div>
			</div>

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script src="assets/js/jquery.2.1.1.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
<script src="assets/js/jquery.1.11.1.min.js"></script>
<![endif]-->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="assets/js/bootstrap.min.js"></script>

		<!-- page specific plugin scripts -->
		<script src="js/jquery.dataTables.js"></script>
		<script src="assets/js/jquery.jqGrid.min.js"></script>
		<script src="assets/js/grid.locale-en.js"></script>

		<script src="assets/js/jquery-ui.custom.min.js"></script>
		<script src="assets/js/jquery-ui.min.js"></script>
		<script src="assets/js/chosen.jquery.min.js"></script>
		<script src="assets/js/bootstrap-datepicker.min.js"></script>
		<script src="assets/js/jquery.autosize.min.js"></script>
		<script src="assets/js/jquery.inputlimiter.1.3.1.min.js"></script>
		<script src="assets/js/jquery.maskedinput.min.js"></script>
		
		
		<!-- ace scripts -->
		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>

		
		<!-- page specific plugin scripts -->
		<script src="assets/js/jquery.dataTables.min.js"></script>
		<script src="assets/js/jquery.dataTables.bootstrap.min.js"></script>
		<script src="assets/js/dataTables.tableTools.min.js"></script>
		<script src="assets/js/dataTables.colVis.min.js"></script>
		<script src="entityJS/vendorJS.js"></script>
		<!-- inline scripts related to this page -->
		
	</body>
</html>
