  <%@ include file="header.jsp" %>
  
          	<div ng-app="app" ng-controller="myController" >
  
  
  <section id="content">
        <div id="breadcrumb-container">
        		<div class="container">
					<ul class="breadcrumb">
						<li><a href="index-2.html">Home</a></li>
						<li class="active">Product</li>
					</ul>
        		</div>
        	</div>
        	
        		
        	<div class="container">
        		<div class="row">
        			<div class="col-md-12">
        				
        				<div class="row">
        					
        					<div class="col-md-9 col-sm-8 col-xs-12 main-content">
        						
        						<div class="category-toolbar clearfix">
									<div class="toolbox-filter clearfix">
									
										<div class="sort-box">
											<span class="separator">sort by:</span>
											<div class="btn-group select-dropdown">
												<button type="button" class="btn select-btn">Position</button>
												<button type="button" class="btn dropdown-toggle" data-toggle="dropdown">
													<i class="fa fa-angle-down"></i>
												</button>
												<ul class="dropdown-menu" role="menu">
													<li><a href="#">Date</a></li>
													<li><a href="#">Name</a></li>
												</ul>
											</div>
										</div>
										
										<div class="view-box">
											<a href="category.html" class="active icon-button icon-grid"><i class="fa fa-th-large"></i></a>
											<a href="category-list.html" class="icon-button icon-list"><i class="fa fa-th-list"></i></a>
										</div><!-- End .view-box -->
										
									</div><!-- End .toolbox-filter -->
									<div class="toolbox-pagination clearfix">
										<ul class="pagination">
											<li class="active"><a href="#">1</a></li>
											<li><a href="#">2</a></li>
											<li><a href="#">3</a></li>
											<li><a href="#">4</a></li>
											<li><a href="#">5</a></li>
											<li><a href="#"><i class="fa fa-angle-right"></i></a></li>
										</ul>
										<div class="view-count-box">
											<span class="separator">view:</span>
											<div class="btn-group select-dropdown">
												<button type="button" class="btn select-btn">10</button>
												<button type="button" class="btn dropdown-toggle" data-toggle="dropdown">
													<i class="fa fa-angle-down"></i>
												</button>
												<ul class="dropdown-menu" role="menu">
													<li><a href="#">15</a></li>
													<li><a href="#">30</a></li>
												</ul>
											</div>
										</div><!-- End .view-count-box -->
										
									</div><!-- End .toolbox-pagination -->
        							
        							
        						</div><!-- End .category-toolbar -->
        						<div class="md-margin"></div><!-- .space -->
        						
        						
        						
        						<div class="category-item-container">
        						<div class="row">
        							<div class="col-md-4 col-sm-6 col-xs-12" ng-repeat="p in jsonData">
        								<div class="item">
        									<div class="item-image-container">
											<figure>
												<a href="product.html">
													<img src="resources/mypro/images/item1.jpg" alt="item1" class="item-image">
													<img src="resources/mypro/images/item1-hover.jpg" alt="item1  Hover" class="item-image-hover">
												</a>
											</figure>
        										<div class="item-price-container">
        											<span class="old-price">{{p.productPrice}}<span class="sub-price">.99</span></span>
													<span class="item-price">{{p.productPrice}}<span class="sub-price">.99</span></span>
												</div>
												<span class="new-rect">New</span>
												<span class="discount-rect">-15%</span>
        									</div><!-- End .item-image -->
        									<div class="item-meta-container">
        										<div class="ratings-container">
        											<div class="ratings">
        												<div class="ratings-result" data-result="70"></div>
        											</div><!-- End .ratings -->
        											<span class="ratings-amount">
        												3 Reviews
        											</span>
        										</div><!-- End .rating-container -->
        										<h3 class="item-name"><a href="product.html">{{p.productName}}</a></h3>
        										<div class="item-action">
        											<a href="#" class="item-add-btn">
														<span class="icon-cart-text">Add to Cart</span>
													</a>
        											<div class="item-action-inner">
        												<a href="#" class="icon-button icon-like">Favourite</a>
        												<a href="#" class="icon-button icon-compare">Checkout</a>
        											</div><!-- End .item-action-inner -->
        										</div><!-- End .item-action -->
        									</div><!-- End .item-meta-container -->	
        								</div><!-- End .item -->
        								
        							</div><!-- End .col-md-4 -->
        							
        							        						</div><!-- End .row -->
        						</div><!-- End .category-item-container -->
        						
        						
        						
        						
        						
        						
        						
        						<div class="pagination-container clearfix">
        							<div class="pull-right">
										<ul class="pagination">
											<li class="active"><a href="#">1</a></li>
											<li><a href="#">2</a></li>
											<li><a href="#">3</a></li>
											<li><a href="#">4</a></li>
											<li><a href="#">5</a></li>
											<li><a href="#"><i class="fa fa-angle-right"></i></a></li>
											</ul>
        							</div><!-- End .pull-right -->
        							
        							<div class="pull-right view-count-box hidden-xs">
										<span class="separator">view:</span>
										<div class="btn-group select-dropdown">
											<button type="button" class="btn select-btn">10</button>
											<button type="button" class="btn dropdown-toggle" data-toggle="dropdown">
												<i class="fa fa-angle-down"></i>
											</button>
											<ul class="dropdown-menu" role="menu">
												<li><a href="#">15</a></li>
												<li><a href="#">30</a></li>
											</ul>
										</div>
									</div>
        						</div><!-- End pagination-container -->
							
        						
        					</div><!-- End .col-md-9 -->
        					
        					<aside class="col-md-3 col-sm-4 col-xs-12 sidebar">
        						<div class="widget">
        							<div class="panel-group custom-accordion sm-accordion" id="category-filter">
										<div class="panel">
											<div class="accordion-header">
												<div class="accordion-title"><span>Category</span></div><!-- End .accordion-title -->
									<a class="accordion-btn opened"  data-toggle="collapse" data-target="#category-list-1"></a>
											</div><!-- End .accordion-header -->
											
										<div id="category-list-1" class="collapse in">
											<div class="panel-body">
											  <ul class="category-filter-list jscrollpane">
											      <c:forEach items="${cList}" var="clist">
													<li><a href="#">${clist.categoryName}</a></li>
													
													</c:forEach>
													</ul>
														
											</div><!-- End .panel-body -->
										</div><!-- #collapse -->
										</div><!-- End .panel -->
        								
        								<div class="panel">
											<div class="accordion-header">
												<div class="accordion-title"><span>Brand</span></div><!-- End .accordion-title -->
									<a class="accordion-btn opened"  data-toggle="collapse" data-target="#category-list-2"></a>
											</div><!-- End .accordion-header -->
								
										<div id="category-list-2" class="collapse in">
											<div class="panel-body">
											<ul class="category-filter-list jscrollpane">
												<li><a href="#">Samsung (50)</a></li>
												<li><a href="#">Apple (80)</a></li>
												<li><a href="#">HTC (20)</a></li>
												<li><a href="#">Motoroloa (20)</a></li>
												<li><a href="#">Nokia (11)</a></li>
											</ul>
											</div><!-- End .panel-body -->
										</div><!-- #collapse -->
										</div><!-- End .panel -->
        							
        							<div class="panel">
											<div class="accordion-header">
												<div class="accordion-title"><span>Price</span></div><!-- End .accordion-title -->
									<a class="accordion-btn opened"  data-toggle="collapse" data-target="#category-list-3"></a>
											</div><!-- End .accordion-header -->
								
										<div id="category-list-3" class="collapse in">
											<div class="panel-body">
												<div id="price-range">
													
												</div><!-- End #price-range -->
												<div id="price-range-details">
													<span class="sm-separator">from</span>
													<input type="text" id="price-range-low" class="separator">
													<span class="sm-separator">to</span>
													<input type="text" id="price-range-high">
												</div>
												<div id="price-range-btns">
													<a href="#" class="btn btn-custom-2 btn-sm">Ok</a>
													<a href="#" class="btn btn-custom-2 btn-sm">Clear</a>
												</div>
												
											</div><!-- End .panel-body -->
										</div><!-- #collapse -->
										</div><!-- End .panel -->
        							
        									</div><!-- #collapse -->
										</div><!-- End .panel -->
        							</div><!-- .panel-group -->
        						</div><!-- End .widget -->
        						
        						
        						
        					</aside><!-- End .col-md-3 -->
        				</div><!-- End .row -->
        				
        				
        			</div><!-- End .col-md-12 -->
        		</div><!-- End .row -->
			</div><!-- End .container -->
        
        </section><!-- End #content -->
  
  <script type="text/javascript">
    var app=angular.module('app',[]);
    app.controller("myController",function($scope){
    	$scope.jsonData=${jsonProductList};
    });
    
    </script>
    
  </div>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
<%@ include file="footer.jsp" %>
  