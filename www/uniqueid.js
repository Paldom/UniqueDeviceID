var exec = require('cordova/exec');


module.exports = {
    
    pick: function(success, fail) {
        cordova.exec(success, fail, 'ContactNumberPicker', 'get', []);
    }

};