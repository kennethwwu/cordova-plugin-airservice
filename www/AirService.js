var exec = require('cordova/exec');

exports.coolMethod = function(arg0, success, error) {
    exec(success, error, "AirService", "coolMethod", [arg0]);
};

exports.testMethod = function(arg0, success, error) {
    exec(success, error, "AirService", "testMethod", [arg0]);
};
