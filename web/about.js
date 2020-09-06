$(function() {
  //alert('got here');
  $("#Content").tabs();
  $("#datepicker").datepicker({
    onSelect: function(dateText, inst) {
      $('#title').text("You picked: " + dateText);
    }
  });
});