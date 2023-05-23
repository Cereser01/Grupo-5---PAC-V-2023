jQuery(document).ready(function ($) {
    //header fixo
    window.onscroll = function () {
        if (window.pageYOffset > 70) {
            $('#header').addClass("active");
        } else {
            $('#header').removeClass("active");
        }
    }
});