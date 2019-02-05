jQuery(function ($) {

    //#main-slider
    $(function () {
        $('#main-slider.carousel').carousel({
            interval: 8000
        });
    });

    //jQuery for page scrolling feature - requires jQuery Easing plugin
    $(function () {
        $('.navbar-collapse li a').bind('click', function (event) {
            var $anchor = $(this);
            var nav = $($anchor.attr('href'));
            if (nav.length) {
                $('html, body').stop().animate({
                    scrollTop: $($anchor.attr('href')).offset().top
                }, 1500, 'easeInOutExpo');

                event.preventDefault();
            }
        });

    });

    //Initiat WOW JS
    new WOW().init();

    $(window).scroll(function () {
        if ($(this).scrollTop() > 100) {
            $('.scrollup').fadeIn();
        } else {
            $('.scrollup').fadeOut();
        }
    });
    $('.scrollup').click(function () {
        $("html, body").animate({scrollTop: 0}, 1000);
        return false;
    });



});

//for LogIn Page

$('#loginSubmit').click(function (e) {
    e.preventDefault();
    var error = false;

//username
    var your_name = $('#username').val();
    if (your_name == "") {
        error = true;
        // alert("put your name");
        $('#username').addClass('error_box').removeClass('noerror_box');
    } else {
        pp = false;
        $('#username').addClass('noerror_box').removeClass('error_box');
    }

//passowrd
    var your_password = $('#Password').val();
    if (your_password == "") {
        error = true;
        // alert("put your name");
        $('#Password').addClass('error_box').removeClass('noerror_box');
    } else {
        qq = false;
        $('#Password').addClass('noerror_box').removeClass('error_box');
    }

//select 
    var error = 0;
    var country = $('#select').val();

    if (country == '0') {
        error = true;
        //alert('You should select a country.');
        $('#select').addClass('error_box').removeClass('noerror_box');
    } else {
        rr = false;
        $('#select').addClass('noerror_box').removeClass('error_box');
    }

    if (rr == false && pp == false && qq == false) {
        $('#Login_Submit').submit();
    }

});

//for registration

$('#register').click(function (e) {
    e.preventDefault();
    var error = false;

    var full_name = $('#Full_Name').val();
    if (full_name == "") {
        error = true;
        // alert("put your name");
        $('#Full_Name').addClass('error_box').removeClass('noerror_box');
    } else {
        a = false;
        $('#Full_Name').addClass('noerror_box').removeClass('error_box');
    }

    var user_name = $('#User_Name').val();
    if (user_name == "") {
        error = true;
        // alert("put your name");
        $('#User_Name').addClass('error_box').removeClass('noerror_box');
    } else {
        b = false;
        $('#User_Name').addClass('noerror_box').removeClass('error_box');
    }

    var your_password = $('#Password').val();
    if (your_password == "") {
        error = true;
        // alert("put your name");
        $('#Password').addClass('error_box').removeClass('noerror_box');
    } else {
        c = false;
        $('#Password').addClass('noerror_box').removeClass('error_box');
    }

    var mobile = $('#Mobile_Number').val();
    if (mobile == "") {
        error = true;
        // alert("put your name");
        $('#Mobile_Number').addClass('error_box').removeClass('noerror_box');
    } else {
        d = false;
        $('#Mobile_Number').addClass('noerror_box').removeClass('error_box');
    }

    var Birthday_Day = $('#Birthday_Day').val();
    if (Birthday_Day == "") {
        error = true;
        // alert("put your name");
        $('#Birthday_Day').addClass('error_box').removeClass('noerror_box');
    } else {
        xx = false;
        $('#Birthday_Day').addClass('noerror_box').removeClass('error_box');
    }

    var Last_Donation = $('#Last_Donation').val();
    if (Last_Donation == "") {
        error = true;
        // alert("put your name");
        $('#Last_Donation').addClass('error_box').removeClass('noerror_box');
    } else {
        yy = false;
        $('#Last_Donation').addClass('noerror_box').removeClass('error_box');
    }

    var address = $('#Address').val();
    if (address == "") {
        error = true;
        // alert("put your name");
        $('#Address').addClass('error_box').removeClass('noerror_box');
    } else {
        e = false;
        $('#Address').addClass('noerror_box').removeClass('error_box');
    }

    var email = $('#Email').val();
    if (email != "" && validateEmail(email)) {
        f = false;
        $('#Email').addClass('noerror_box').removeClass('error_box');

    } else {

        error = true;
        alert('You Are Missing Some Text..');
        $('#Email').addClass('error_box').removeClass('noerror_box');
    }

    var error = 0;
    var country = $('#Blood_Group').val();

    if (country == '1') {
        error = true;
        //alert('You should select a country.');
        $('#Blood_Group').addClass('error_box').removeClass('noerror_box');
    } else {
        g = false;
        $('#Blood_Group').addClass('noerror_box').removeClass('error_box');
    }


    var error = 0;
    var gen = $('#Gender').val();
    if (gen == '2') {
        error = true;
        //alert('You should select a country.');
        $('#Gender').addClass('error_box').removeClass('noerror_box');
    } else {
        h = false;
        $('#Gender').addClass('noerror_box').removeClass('error_box');
    }

    var error = 0;
    var aa = $('#City').val();
    if (aa == '3') {
        error = true;
        //alert('You should select a country.');
        $('#City').addClass('error_box').removeClass('noerror_box');
    } else {
        i = false;
        $('#City').addClass('noerror_box').removeClass('error_box');
    }

    if (a == false && b == false && c == false && d == false
            && e == false && f == false && g == false
            && h == false && i == false && xx == false && yy == false) {
        $('#Registration_Submit').submit();


    }

});
//register end



//for message

$('#Submit_Message').click(function (e) {
    e.preventDefault();
    var error = false;

//username
    var your_name = $('#your_name').val();
    if (your_name == "") {
        error = true;
        // alert("put your name");
        $('#your_name').addClass('error_box').removeClass('noerror_box');
    } else {
        rr = false;
        $('#your_name').addClass('noerror_box').removeClass('error_box');
    }

//    for mail

    var email = $('#your_Email').val();
    if (email != "" && validateEmail(email)) {
        xx = false;
        $('#your_Email').addClass('noerror_box').removeClass('error_box');

    } else {

        error = true;
        alert('You Are Missing Some Text..');
        $('#your_Email').addClass('error_box').removeClass('noerror_box');
    }

////subject
    var subject = $('#subject').val();
    if (subject == "") {
        error = true;
        // alert("put your name");
        $('#subject').addClass('error_box').removeClass('noerror_box');
    } else {
        qq = false;
        $('#subject').addClass('noerror_box').removeClass('error_box');
    }

////select 
    var your_Message = $('#your_Message').val();
    if (your_Message == "") {
        error = true;
        // alert("put your name");
        $('#your_Message').addClass('error_box').removeClass('noerror_box');
    } else {
        mm = false;
        $('#your_Message').addClass('noerror_box').removeClass('error_box');
    }

    if (rr == false && xx == false && qq == false && mm == false) {
        $('#Contact_Submit').submit();
    }

});

//Admin registration

$('#Admin_register').click(function (e) {
    e.preventDefault();
    var error = false;

    var user_name = $('#User_Name').val();
    if (user_name == "") {
        error = true;
        // alert("put your name");
        $('#User_Name').addClass('error_box').removeClass('noerror_box');
    } else {
        a1 = false;
        $('#User_Name').addClass('noerror_box').removeClass('error_box');
    }

    var your_password = $('#Password').val();
    if (your_password == "") {
        error = true;
        // alert("put your name");
        $('#Password').addClass('error_box').removeClass('noerror_box');
    } else {
        a2 = false;
        $('#Password').addClass('noerror_box').removeClass('error_box');
    }

    var mobile = $('#Mobile_Number').val();
    if (mobile == "") {
        error = true;
        // alert("put your name");
        $('#Mobile_Number').addClass('error_box').removeClass('noerror_box');
    } else {
        a3 = false;
        $('#Mobile_Number').addClass('noerror_box').removeClass('error_box');
    }


    var Last_Donation = $('#Last_Donation').val();
    if (Last_Donation == "") {
        error = true;
        // alert("put your name");
        $('#Last_Donation').addClass('error_box').removeClass('noerror_box');
    } else {
        a4 = false;
        $('#Last_Donation').addClass('noerror_box').removeClass('error_box');
    }


    var email = $('#Email').val();
    if (email != "" && validateEmail(email)) {
        a5 = false;
        $('#Email').addClass('noerror_box').removeClass('error_box');
    } else {
        error = true;
        alert('You Are Missing Some Text..');
        $('#Email').addClass('error_box').removeClass('noerror_box');
    }

    var error = 0;
    var country = $('#Blood_Group').val();
    if (country == '1') {
        error = true;
        //alert('You should select a country.');
        $('#Blood_Group').addClass('error_box').removeClass('noerror_box');
    } else {
        a6 = false;
        $('#Blood_Group').addClass('noerror_box').removeClass('error_box');
    }

    if (a1 == false && a2 == false && a3 == false && a4 == false
            && a5 == false && a6 == false) {
        $('#Admin_Submit').submit();
    }

});

//for forgot
$('#forgotSubmit').click(function (e) {
    e.preventDefault();
    //var error = false;

    var email = $('#email').val();
    if (email != "" && validateEmail(email)) {
        f = false;
        $('#email').addClass('noerror_box').removeClass('error_box');

    } else {

        error = true;
        alert('You Are Missing Some Text..');
        $('#email').addClass('error_box').removeClass('noerror_box');
    }


    if (f == false) {
        $('#forgotSend').submit();
    }

});
//end forgot
//for mail code
$('#code').click(function (e) {
    e.preventDefault();
    //var error = false;

    var code = $('#code').val();
    if (code != "" && validateEmail(code)) {
        f = false;
        $('#code').addClass('noerror_box').removeClass('error_box');

    } else {

        error = true;
        $('#code').addClass('error_box').removeClass('noerror_box');
    }


    if (f == false) {
        $('#codeSubmit').submit();
    }

});
//for blood search

$('#bloodSearch').click(function (e) {
    e.preventDefault();
    //var error = false;

    var address = $('#Address').val();
    if (address == "") {
        error = true;
        // alert("put your name");
        $('#Address').addClass('error_box').removeClass('noerror_box');
    } else {
        e = false;
        $('#Address').addClass('noerror_box').removeClass('error_box');
    }

    var error = 0;
    var aa = $('#City').val();
    if (aa == '3') {
        error = true;
        //alert('You should select a country.');
        $('#City').addClass('error_box').removeClass('noerror_box');
    } else {
        i = false;
        $('#City').addClass('noerror_box').removeClass('error_box');
    }
    var error = 0;
    var country = $('#Blood_Group').val();

    if (country == '1') {
        error = true;
        //alert('You should select a country.');
        $('#Blood_Group').addClass('error_box').removeClass('noerror_box');
    } else {
        g = false;
        $('#Blood_Group').addClass('noerror_box').removeClass('error_box');
    }
    if ( e == false && g == false
             && i == false ) {
        $('#Blood_Search').submit();


    }

});

//Admin registration end

//for order

$('#Order').click(function (e) {
    e.preventDefault();
    
    var blood_id = $('#blood_id').val();
    if (blood_id == "") {
        error = true;     
        $('#blood_id').addClass('error_box').removeClass('noerror_box');
    } else {
        a1= false;
        $('#blood_id').addClass('noerror_box').removeClass('error_box');
    }
    
     var Blood_Group = $('#Blood_Group').val();
    if (Blood_Group == "") {
        error = true;     
        $('#Blood_Group').addClass('error_box').removeClass('noerror_box');
    } else {
        a2= false;
        $('#Blood_Group').addClass('noerror_box').removeClass('error_box');
    }
    
         var Price = $('#Price').val();
    if (Price == "") {
        error = true;     
        $('#Price').addClass('error_box').removeClass('noerror_box');
    } else {
        a3 = false;
        $('#Price').addClass('noerror_box').removeClass('error_box');
    }
    
             var Delivary = $('#Delivary').val();
    if (Delivary == "") {
        error = true;     
        $('#Delivary').addClass('error_box').removeClass('noerror_box');
    } else {
        a4 = false;
        $('#Delivary').addClass('noerror_box').removeClass('error_box');
    }
    
            var Full_Name = $('#Full_Name').val();
    if (Delivary == "") {
        error = true;     
        $('#Full_Name').addClass('error_box').removeClass('noerror_box');
    } else {
        a5 = false;
        $('#Full_Name').addClass('noerror_box').removeClass('error_box');
    }
    
            var Mobile = $('#Mobile').val();
    if (Mobile == "") {
        error = true;     
        $('#Mobile').addClass('error_box').removeClass('noerror_box');
    } else {
        a6 = false;
        $('#Mobile').addClass('noerror_box').removeClass('error_box');
    }
    
            var Email = $('#Email').val();
    if (Email != "" && validateEmail(Email)) {
        a7 = false;
        $('#Email').addClass('noerror_box').removeClass('error_box');
    } else {
         error = true;     
        $('#Email').addClass('error_box').removeClass('noerror_box');
       
    }
    
            var Address = $('#Address').val();
    if (Address == "") {
        error = true;     
        $('#Address').addClass('error_box').removeClass('noerror_box');
    } else {
        a8 = false;
        $('#Address').addClass('noerror_box').removeClass('error_box');
    }
    
         var City = $('#City').val();
    if (City == "") {
        error = true;     
        $('#City').addClass('error_box').removeClass('noerror_box');
    } else {
        a9= false;
        $('#City').addClass('noerror_box').removeClass('error_box');
    }

  
    if ( a1== false && a2 == false
             && a3 == false && a4== false && a5 == false
             && a6 == false && a7== false && a8 == false
             && a9 == false ) {
        $('#Order_Submit').submit();

    }

});

//end order

//for blood donor registration
$('#Donor_register').click(function (e) {
    e.preventDefault();
    
    var Full_Name = $('#Full_Name').val();
    if (Full_Name == "") {
        error = true;     
        $('#Full_Name').addClass('error_box').removeClass('noerror_box');
    } else {
        a1= false;
        $('#Full_Name').addClass('noerror_box').removeClass('error_box');
    }
    
    var error = 0;
    var country = $('#Blood_Group').val();
    if (country == '1') {
        error = true;
        //alert('You should select a country.');
        $('#Blood_Group').addClass('error_box').removeClass('noerror_box');
    } else {
        a2 = false;
        $('#Blood_Group').addClass('noerror_box').removeClass('error_box');
    }
    
         var Donated_Date = $('#Donated_Date').val();
    if (Donated_Date == "") {
        error = true;     
        $('#Donated_Date').addClass('error_box').removeClass('noerror_box');
    } else {
        a3 = false;
        $('#Donated_Date').addClass('noerror_box').removeClass('error_box');
    }
    
             var Mobile_Number = $('#Mobile_Number').val();
    if (Mobile_Number == "") {
        error = true;     
        $('#Mobile_Number').addClass('error_box').removeClass('noerror_box');
    } else {
        a4 = false;
        $('#Mobile_Number').addClass('noerror_box').removeClass('error_box');
    }
    
            var City = $('#City').val();
    if (City == "") {
        error = true;     
        $('#City').addClass('error_box').removeClass('noerror_box');
    } else {
        a5 = false;
        $('#City').addClass('noerror_box').removeClass('error_box');
    }
    
            var Address = $('#Address').val();
    if (Address == "") {
        error = true;     
        $('#Address').addClass('error_box').removeClass('noerror_box');
    } else {
        a6 = false;
        $('#Address').addClass('noerror_box').removeClass('error_box');
    }
    
            var Email = $('#Email').val();
    if (Email != "" && validateEmail(Email)) {
        a7 = false;
        $('#Email').addClass('noerror_box').removeClass('error_box');
    } else {
         error = true;     
        $('#Email').addClass('error_box').removeClass('noerror_box');
       
    }
    
            var Address = $('#Address').val();
    if (Address == "") {
        error = true;     
        $('#Address').addClass('error_box').removeClass('noerror_box');
    } else {
        a8 = false;
        $('#Address').addClass('noerror_box').removeClass('error_box');
    }
    
   var error = 0;
    var aa = $('#City').val();
    if (aa == '3') {
        error = true;

        $('#City').addClass('error_box').removeClass('noerror_box');
    } else {
        i = false;
        $('#City').addClass('noerror_box').removeClass('error_box');
    }
    if ( a1== false && a2 == false
             && a3 == false && a4== false && a5 == false
             && a6 == false && a7== false && a8 == false
             && i == false ) {
        $('#Ordered_Donor_submit').submit();

    }

});
//end blood donor registration


// delivary check
$('#Delivary_Check').click(function (e) {
    e.preventDefault();
    
  var error = 0;
    var Blood_Group = $('#Blood_Group').val();
    if (Blood_Group == '1') {
        error = true;
        //alert('You should select a country.');
        $('#Blood_Group').addClass('error_box').removeClass('noerror_box');
    } else {
        a1 = false;
        $('#Blood_Group').addClass('noerror_box').removeClass('error_box');
    }
    
    var Full_Name = $('#Full_Name').val();
    if (Full_Name == "") {
        error = true;     
        $('#Full_Name').addClass('error_box').removeClass('noerror_box');
    } else {
       b1= false;
        $('#Full_Name').addClass('noerror_box').removeClass('error_box');
    }
    

         var Delivary = $('#Delivary').val();
    if (Delivary == "") {
        error = true;     
        $('#Delivary').addClass('error_box').removeClass('noerror_box');
    } else {
      c1 = false;
        $('#Delivary').addClass('noerror_box').removeClass('error_box');
    }
    
       
    if ( a1== false && b1 == false
             && c1 == false ) {
        $('#Delivary_submit').submit();

    }

});
//end delivary check
function validateEmail(sEmail) {
    var filter = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
    if (filter.test(sEmail)) {
        return true;
    }
    else {
        return false;
    }
}
