$(document).ready(function(){
    $(window).scroll(function () {
        if ($(this).scrollTop() > 150) {
            $('#btnTop').show();
        } else {
            $('#btnTop').hide();
        }
    });
    $('#btnTop').click(function () {
        $('body,html').animate({
            scrollTop: 0
        }, 400);
        return false;
    });
});