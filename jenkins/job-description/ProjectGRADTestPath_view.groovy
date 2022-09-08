 
listView('ProjectGRADTestPath Jobs') {
    description('ProjectGRADTestPath Jobs')
    jobs {
        regex('ProjectGRADTestPath_.+')
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
