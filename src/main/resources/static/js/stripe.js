 const stripe = Stripe('pk_test_51QQFKCHBHD4r38jAibur8mtcJOGDgJXRuxUdTxI9TxsXuXmYfVYTVKNFaOtr4Y18tGWx1QQvhSIPOQTV5RMuzLcE00ROuP81Ii');
 const paymentButton = document.querySelector('#paymentButton');
 
 paymentButton.addEventListener('click', () => {
   stripe.redirectToCheckout({
     sessionId: sessionId
   })
 });