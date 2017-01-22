<div class="footer-top-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <div class="footer-about-us">
                        <h2>T<span>echFab</span></h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>
                        <div class="footer-social">
                            <a href="#" target="_blank"><i class="fa fa-facebook"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-twitter"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-youtube"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-linkedin"></i></a>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">User Navigation </h2>
                        <ul>
                            <li><a href="#">My account</a></li>
                            <li><a href="#">Order history</a></li>
                            <li><a href="#">Wishlist</a></li>
                            <li><a href="#">Vendor contact</a></li>
                            <li><a href="#">Front page</a></li>
                        </ul>                        
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">Categories</h2>
                        <ul>
                            <li><a href="#">Mobile Phone</a></li>
                            <li><a href="#">Home accesseries</a></li>
                            <li><a href="#">LED TV</a></li>
                            <li><a href="#">Computer</a></li>
                            <li><a href="#">Gadets</a></li>
                        </ul>                        
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-newsletter">
                        <h2 class="footer-wid-title">Newsletter</h2>
                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>
                        <div class="newsletter-form">
                            <form action="#">
                                <input type="email" placeholder="Type your email">
                                <input type="submit" value="Subscribe">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End footer top area -->
    
     </div><!-- End #wrapper -->
        <a href="#" id="scroll-top" title="Scroll to Top"><i class="fa fa-angle-up"></i></a><!-- End #scroll-top -->
	<!-- END -->
    <script src="resources/mypro/js/bootstrap.min.js"></script>
    <script src="resources/mypro/js/smoothscroll.js"></script>
    <script src="resources/mypro/js/retina-1.1.0.min.js"></script>
    <script src="resources/mypro/js/jquery.placeholder.js"></script>
    <script src="resources/mypro/js/jquery.hoverIntent.min.js"></script>
    <script src="resources/mypro/js/twitter/jquery.tweet.min.js"></script>
    <script src="resources/mypro/js/jquery.flexslider-min.js"></script>
    <script src="resources/mypro/js/owl.carousel.min.js"></script>
    <script src="resources/mypro/js/jflickrfeed.min.js"></script>
    <script src="resources/mypro/js/jquery.prettyPhoto.js"></script>
    <script src="resources/mypro/js/jquery.sequence-min.js"></script>
    <script src="resources/mypro/js/colpick.js"></script>
    <script src="resources/mypro/js/main.js"></script>
	
    <script>
    	$(function() {
    		// Sequence.js Slider Plugin
			var options = {
				nextButton: true,
				prevButton: true,
				pagination:true,
				autoPlay: true,
				autoPlayDelay: 8500,
				pauseOnHover: true,
				preloader: true,
				theme: 'slide',
				speed: 700,
				animateStartingFrameIn: true
                },
				homeSlider = $('#slider-sequence').sequence(options).data("sequence");
    	
    	});
    	
    	
		$(function() {

			var carouselContainer = $('#product-carousel'),
                productImg =  $('#product-image');

			carouselContainer.elastislide({
				orientation : 'vertical',
				minItems : 4
					
			});

            productImg.mlens({
                imgSrc: $("#product-image").attr("data-big"),         
                lensShape: "square",
                lensSize: 150,
                borderSize: 4,
                borderColor: "#999",
                borderRadius: 0
            });
			
			
			var oldImg = productImg.attr('src');
			carouselContainer.find('li').on('mouseover', function() {
				
				var newImg = $(this).find('a').attr('href');
				
                productImg.attr({'src': newImg, 'data-big': newImg}).trigger('imagechanged');
                
			});

            // triggered with custom event
            productImg.on('imagechanged', function() {
                productImg.mlens("update", 0 ,{
                    imgSrc: productImg.attr("data-big"),
                    lensShape: "square",
                    lensSize: 150,
                    borderSize: 4,
                    borderColor: "#999"
                });
            });

		});
    </script>
    </body>
</html>