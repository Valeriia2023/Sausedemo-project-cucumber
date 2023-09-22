exports.config = {
    runner: 'local',
    specs: [
        './features/**/*.feature'
    ],
    capabilities: [{
        browserName: 'chrome'
    }],
    baseUrl: 'https://www.saucedemo.com', 
    framework: 'cucumber', 
    reporters: ['spec'], 
    cucumberOpts: {
        require: ['./src/test/java/com/example/MyStepDefinitions.java'], 
    },
}
       
    