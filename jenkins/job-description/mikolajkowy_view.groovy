 
listView('mikolajkowy Jobs') {
    description('mikolajkowy Jobs')
    jobs {
        regex('mikolajkowy_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
