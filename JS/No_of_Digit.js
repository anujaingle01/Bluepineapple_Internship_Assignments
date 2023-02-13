
<script>
    function noOfDigits(num) {
        let count = 0;
        if (num > 0 || num < 0) {
            while ((Math.trunc(num)) > 0) {
                count++;
                num = num / 10;
            }
        }
        else if (num == 0) {
            count = 1;
        }
        else {
            count = 0;
        }
        return count;
    }
    let num = prompt('enter number');
    alert(noOfDigits(num));
</script>
