
async function fetchQuote() {
    try {
        const response = await fetch('api/quote');
        const quote = await response.text();
        document.getElementById('quoteContainer').innerHTML = quote;
    } catch (error) {
        console.error('Error fetching quote:', error);
        document.getElementById('quoteContainer').innerHTML = 'Error fetching quote';
    }

    window.onLoad = fetchQuote;
}