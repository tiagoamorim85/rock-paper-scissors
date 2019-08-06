<anyxmlelement xmlns:c="http://java.sun.com/jsp/jstl/core" />

<html>

<body>
    <center>
        <h1>Rock Paper Scissors</h1>

        <div>
            <form name="myform" method="get" id="form">

                <button form="form" name="userChoice" value="0">Rock</button>

                <button form="form" name="userChoice" value="1">Paper</button>

                <button form="form" name="userChoice" value="2">Scissors</button>
            </form>
        </div>
        <br>
        <div id="result">
            <h2>Result</h2>
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