<anyxmlelement xmlns:c="http://java.sun.com/jsp/jstl/core" />

<html>

<body>
    <center>
        <h2>Rock Paper Scissors</h2>

        <div>
            <form name="myform" method="get" id="form">

                <button form="form" name="button" value="0">Rock</button>

                <button form="form" name="button" value="1">Paper</button>

                <button form="form" name="button" value="2">Scissors</button>
            </form>
        </div>
        <br>
        <div id="result">
            <h1>Result</h1>
            <ul>
                <p><b>User choice:</b>
                    ${result.userChoice}
                </p>
                <p><b>Computer choice:</b>
                    ${result.computerChoice}
                </p>
                <p><b>Result:</b>
                    ${result.result}
                </p>
            </ul>
        </div>
    </center>
</body>

</html>