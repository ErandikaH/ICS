<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Inventory Control System</title>

		<meta name="description" content="Dynamic tables and grids using jqGrid plugin" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

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
								<a href="#">Item</a>
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
										<label for="assetNumberForSearch" style="margin-left:10px;">Asset Number:</label><input type="text" id="assetNumberForSearch" name="assetNumberForSearch" style="margin-left:30px;"/>
										<label for="serialNumberForSearch" style="margin-left:20px;">Serial Number:</label><input type="text" id="serialNumberForSearch" name="serialNumberForSearch" style="margin-left:30px;"/>
										<label for="statusNameForSearch" style="margin-left:35px;">Status Name:</label><input type="text" id="statusNameForSearch" name="statusNameForSearch" style="margin-left:35px;"/>

										<button type="button" id="myButton" name="myButton" onclick="searchFun();" class="btn btn-purple btn-sm pull-right" style="margin-right: 30px;">
											<span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
											Search
										</button>
									</div>
						
									</div>
								

								</div>
								
								<div class="hr hr32 hr-dotted" style="
								    margin-top: 5px;
								    margin-bottom: 5px;
								"></div>
								<div class="row">
									<div class="col-xs-12">
											

											<div class="widget-body">
												<div class="col-xs-12">
									<table id="grid-table"></table>

												<div id="grid-pager"></div></div><!-- /.widget-main -->
											</div><!-- /.widget-body -->
										
									</div><!-- /.col -->

								</div><!-- /.row -->

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
											<button class="btn btn-white btn-warning btn-bold"  id="updateButton" onclick="enableEditButton(this.id)">
																		<i class="ace-icon fa fa-pencil align-top bigger-125"></i>
																		Update
																	</button>
																	&nbsp; &nbsp; &nbsp;
											<button class="btn btn-white btn-warning btn-bold"  id="deleteButton" onclick="enableDeleteButton(this.id)">
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
										</h4></div>
										<div class="tabbable">
											<ul class="nav nav-tabs padding-12 tab-color-blue background-blue" id="myTab4">
												<li class="active">
													<a data-toggle="tab" href="#member-tab">Item Detail</a>
												</li>

												<li>
													<a data-toggle="tab" href="#comment-tab">Item Assign Detail</a>
												</li>

											</ul>

											<div class="tab-content">
												<div id="member-tab" class="tab-pane in active">
													<div class="row">
					
															<input type="hidden" id="itemId" name="itemId"><br>
															<div class="col-xs-6">
															<fieldset class="scheduler-border">
													            <legend class="scheduler-border">General</legend>
													
													            <div class="form-group required" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="assetNumber"> Asset Number: </label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="assetNumber" name="assetNumber" placeholder="Asset Number" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>
																<div class="form-group required" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="serialNumber"> Serial Number:</label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="serialNumber" name="serialNumber" placeholder="Serial Number" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>
																<div class="form-group required" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="price"> Price:</label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="price" name="price" placeholder="Rs." class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>
																
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="department"> Department:</label>

																	<div class="col-md-8">
																		<s:select id="department" class="form-control"
											                        headerKey="-1" headerValue="Select Department"
											                        list="{'Select Department'}" disabled="true"/>
											                        
											              
																	</div>
																</div>
																<br><br>
																
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="description"> Description:</label>

																	<div class="col-md-8">
																		<input type="text" style="width:100%" id="description" name="description" placeholder="Description" class="col-xs-10 col-sm-5" disabled/>
																	</div>
																</div>
																<br><br>												
																
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="invoiceNumber"> Invoice Number:</label>

																	<div class="col-md-8">
																		<s:select id="invoiceNumber" class="form-control"
											                        headerKey="-1" headerValue="Select Select Invoice Number"
											                        list="{'Select Invoice Number'}" disabled="true"/>
											                        
											              
																	</div>
																</div>
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																		
																	<label class="col-md-4 control-label no-padding-right" for="warrantyStartDate">Warranty Start Date:</label>

													
																	<!-- <div class="col-xs-8 col-sm-11"> -->
																	<div class="col-md-6">
																		<div class="input-group">
																			<input class="form-control date-picker" id="warrantyStartDate" name="warrantyStartDate" placeholder="dd-mm-yyyy"type="text" data-date-format="dd-mm-yyyy" disabled/>
																			<span class="input-group-addon">
																				<i class="fa fa-calendar bigger-110"></i>
																			</span>
																		</div>
																	</div>
														
																<div class="space space-8"></div>
																</div>
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																		
																	<label class="col-md-4 control-label no-padding-right" for="warrantyEndDate">Warranty End Date:</label>

													
																	<!-- <div class="col-xs-8 col-sm-11"> -->
																	<div class="col-md-6">
																		<div class="input-group">
																			<input class="form-control date-picker" id="warrantyEndDate" name="warrantyEndDate" placeholder="dd-mm-yyyy"type="text" data-date-format="dd-mm-yyyy" disabled/>
																			<span class="input-group-addon">
																				<i class="fa fa-calendar bigger-110"></i>
																			</span>
																		</div>
																	</div>
														
																
																</div>
																 
																
													        </fieldset>
															
															
															</div>
															
																<div class="col-xs-6">
															
																	<fieldset class="scheduler-border">
															            <legend class="scheduler-border">Manufacturer Info</legend>
															
															            <div class="form-group" style="margin-bottom: 0px;">
																			<label class="col-md-4 control-label no-padding-right" for="make"> Make: </label>
		
																			<div class="col-md-8">
																				<input type="text" style="width:100%" id="make" name="make" placeholder="Make" class="col-xs-10 col-sm-5" disabled/>
																			</div>
																		</div>
																		<br><br>
																		
																		
																		<div class="form-group" style="margin-bottom: 0px;">
																			<label class="col-md-4 control-label no-padding-right" for="model"> Model: </label>
		
																			<div class="col-md-8">
																				<input type="text" style="width:100%" id="model" name="model" placeholder="Model" class="col-xs-10 col-sm-5" disabled/>
																			</div>
																		</div>
																		<br><br>
																		
									
															        </fieldset>
																	
																	
																</div>
																
																<div class="col-xs-6">
															
															<fieldset class="scheduler-border">
													            <legend class="scheduler-border">Other</legend>
									
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="statusName"> Status Name: </label>

																	<div class="col-md-8">
																		<s:select id="statusName" class="form-control"
											                        headerKey="-1" headerValue="Select Status"
											                        list="{'Select Status'}" disabled="true"/>
											                        
											              
																	</div>
																</div>
									
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																	<label class="col-md-4 control-label no-padding-right" for="categoryName"> Category Name: </label>

																	<div class="col-md-8">
																		<s:select id="categoryName" class="form-control"
											                        headerKey="-1" headerValue="Select Category"
											                        list="{'Select Category'}" disabled="true"/>
											                        
											              
																	</div>
																</div>
																<br><br>
																<div class="form-group" style="margin-bottom: 0px;">
																
																
																<div>
																	<label class="col-md-4 control-label no-padding-right" for="remark">Remark:</label>
																	<div class="col-md-8">
																		<textarea id="remark" style="width:100%" name="remark" placeholder="Remark" class="autosize-transition form-control" disabled></textarea>
																	</div>
																	
																</div></div>
													        </fieldset>
															
															
															</div>
															
															
															
															<div class="col-xs-6">
															
																<button class="btn btn-info" id="addVendor" onclick="addRow();" style="float: right; margin-top: 10px;" disabled>
															<!-- <button class="btn btn-info" id="addVendor" type="submit" formaction="addVendor" disabled> -->
																<i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
																Add
															</button>
																
																</div>
															
															</div>
									
																
												</div>

												<div id="comment-tab" class="tab-pane">
													<div class="row">
													
									<div class="col-xs-6">
										
										<div class="clearfix">
											<div class="pull-right tableTools-container"></div>
										</div>
										<div class="table-header">
											Results for Assign Item
										</div>

										<!-- div.table-responsive -->

										<!-- div.dataTables_borderWrap -->
										<div>
											<table id="dynamic-table" class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>ID</th>
														<th>User ID</th>
														<th>Start Date</th>
												
														<th>End Date</th>

													
													</tr>
												</thead>

												<tbody>	
												</tbody>
											</table>
										</div></div>
										
										<div class="col-xs-6">
										
										<fieldset class="scheduler-border">
								            <legend class="scheduler-border">General Info</legend>
											<input type="hidden" id="itemAssetNo" name="itemAssetNo"><br>
								            <div class="form-group" style="margin-bottom: 0px;">
												<label class="col-md-4 control-label no-padding-right" for="assignItemAssetNumber"> Asset Number: </label>
	
												<div class="col-md-8">
													<input type="text" style="width:100%" id="assignItemAssetNumber" name="assignItemAssetNumber" placeholder="Asset Number" class="col-xs-10 col-sm-5" disabled/>
												</div>
											</div>
											<br><br>
											<div class="form-group" style="margin-bottom: 0px;">
													
												<label class="col-md-4 control-label no-padding-right" for="startDate">Start Date:</label>
	
								
												<!-- <div class="col-xs-8 col-sm-11"> -->
												<div class="col-md-6">
													<div class="input-group">
														<input class="form-control date-picker" id="startDate" name="startDate" placeholder="dd-mm-yyyy"type="text" data-date-format="dd-mm-yyyy" disabled/>
														<span class="input-group-addon">
															<i class="fa fa-calendar bigger-110"></i>
														</span>
													</div>
												</div>
									
											<div class="space space-8"></div>
											</div>
											<br><br>
											<div class="form-group" style="margin-bottom: 0px;">
													
												<label class="col-md-4 control-label no-padding-right" for="endDate">End Date:</label>
	
								
												<!-- <div class="col-xs-8 col-sm-11"> -->
												<div class="col-md-6">
													<div class="input-group">
														<input class="form-control date-picker" id="endDate" name="endDate" placeholder="dd-mm-yyyy"type="text" data-date-format="dd-mm-yyyy" disabled/>
														<span class="input-group-addon">
															<i class="fa fa-calendar bigger-110"></i>
														</span>
													</div>
												</div>
									
											
											</div>
		
											<br><br>
											<div class="form-group" style="margin-bottom: 0px;">
													<label class="col-md-4 control-label no-padding-right" for="assignItemStatusName"> Status Name: </label>
	
													<div class="col-md-8">
														<s:select id="assignItemStatusName" class="form-control"
							                        headerKey="-1" headerValue="Select Status"
							                        list="{'Select Status'}" disabled="true"/>
							                        
							              
													</div>
												</div>
												<br><br>
											 <div class="form-group" style="margin-bottom: 0px;">
											
											
											<div>
												<label class="col-md-4 control-label no-padding-right" for="assignItemRemark">Remark:</label>
												<div class="col-md-8">
													<textarea id="assignItemRemark" style="width:100%" name="assignItemRemark" placeholder="Assign Item Remark" class="autosize-transition form-control" disabled></textarea>
												</div>
												
											</div></div>
											<br><br>
																
											</fieldset>
											
															
															
										</div>
										</div>

									<div class="row">
										<div class="col-xs-6">
										<fieldset class="scheduler-border">
									            <legend class="scheduler-border">Location Info</legend>
									
									           
												<div class="form-group" style="margin-bottom: 0px;">
													<label class="col-md-4 control-label no-padding-right" for="buildingNumber">Building Number: </label>
	
													<div class="col-md-8">
														<s:select id="buildingNumber" class="form-control"
							                        headerKey="-1" headerValue="Select Status"
							                        list="{'29','9'}" disabled="true"/>
							                        
							              
													</div>
												</div>
												<br><br>
												
												<div class="form-group" style="margin-bottom: 0px;">
													<label class="col-md-4 control-label no-padding-right" for="floor">Floor: </label>
	
													<div class="col-md-8">
														<s:select id="floor" class="form-control"
									                        headerKey="-1" headerValue="Select Floor"
									                        list="{}" disabled="true"/>
			
													</div>
												</div>
												<br><br>
												
												<div class="form-group" style="margin-bottom: 0px;">
													<label class="col-md-4 control-label no-padding-right" for="locationName">Location Name: </label>
	
													<div class="col-md-8">
														<s:select id="locationName" class="form-control"
								                        headerKey="-1" headerValue="Select Location"
								                        list="{}" disabled="true"/>
								
							              
													</div>
												</div>
									        </fieldset>
									        </div>
									        
									        <div class="col-xs-6" style="float: right;">
									        	<button class="btn btn-minier btn-purple" id="addRate" onclick="addRowToRateTable();" style="float: right; margin-top: 20px;" disabled>
													<i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
															Add
												</button>
									        </div>
										
										<!-- /.span -->
										</div>
								
										
										
												</div>

											</div>
										</div>
										
																<div class="clearfix form-actions" style="margin-top: 5px; margin-bottom: 0px; padding-top: 2px; padding-bottom: 3px; padding-left: 200px">
																<div class="col-md-offset-3 col-md-9">
																
																	
																	<button class="btn btn-info" id="addItem" onclick="addItem();" style="float: center; padding-right:25px;">
																	<!-- <button class="btn btn-info" id="addVendor" type="submit" formaction="addVendor" disabled> -->
																		<i class="ace-icon fa fa-floppy-o bigger-120 purple"></i>
																		Save
																	</button>

	
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
		<script src="entityJS/itemJS.js"></script>
		<!-- inline scripts related to this page -->
		
	</body>
</html>
