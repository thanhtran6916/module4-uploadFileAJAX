function create() {
    var form = $("#fileUploadForm")[0];
    var data = new FormData(form);
    data.append("description", "new");

    $.ajax({
        url: "http://localhost:8080/images/",
        type: "POST",
        enctype: 'multipart/form-data',
        processData: false,
        contentType: false,
        cache: false,
        data: data,
        timeout: 600000,
        success: function (data) {
            alert(data);
        }
    });
}