jQuery.fn.extend({
    uploadPreview: function (opts) {
        opts = jQuery.extend({
            fileName : 'inputfilename', //file的name
            fileId : 'fileId',			//file的id
            ListId: "List",		//包含图片li的容器ul的id
            Width: 110,
            Height: 110,
            ImgType: ["gif", "jpeg", "jpg", "bmp", "png"],
            Callback: function () {}
        }, opts || {});
        var i = 0,$this = $(this),inputhtml="";
        $this.on('click',function(){
        	inputhtml = '<input type="file" style="display: none;" onchange="filechange(this)" id="'+opts.fileId+i+'" name="'+opts.fileName+'"/>';
			$('#'+opts.ListId).append(inputhtml);
			$('#'+opts.fileId+i).data("opts",opts);
			$('#'+opts.fileId+i).trigger("click");
			i++;
        });
        var _self = $('#'+opts.fileId+i);
        _self.getObjectURL = function (file) {
            var url = null;
            if (window.createObjectURL != undefined) {
                url = window.createObjectURL(file)
            } else if (window.URL != undefined) {
                url = window.URL.createObjectURL(file)
            } else if (window.webkitURL != undefined) {
                url = window.webkitURL.createObjectURL(file)
            }
            return url
        };
        filechange = function (e) {
        	var html = "";
			var _this = $(e);
			var _opts=_this.data('opts');
			var fileid = $(e).attr("id");
			var uploadList = $('#'+_opts.ListId);
            if (_this.val()) {
                if (!RegExp("\.(" + opts.ImgType.join("|") + ")$", "i").test(e.value.toLowerCase())) {
                    alert("选择文件错误,图片类型必须是" + opts.ImgType.join("，") + "中的一种");
                    e.value = "";
                    return false
                }
                if ($.support.msie) {
                    try {
                        html += '<li onmouseleave="moveOut(this)">';
	                	html += '	<div class="upload-content">';
						html += '		<div class="file-panel">';
						html += '			<span class="cancel" onclick="delImg('+fileid+',this)" title="删除"></span>';
						html += '		</div>';
		                html += '		<img src='+_self.getObjectURL(e.files[0])+' onmouseover="moveUp(this)" class="list-img">';
						html += '	</div>';
						html += '</li>';
                    } catch (e) {
                        var src = "";
                        var obj = $(".list-img");
                        var li = obj.parents("li")[0];
                        _self.select();
                        if (top != self) {
                            window.parent.document.body.focus()
                        } else {
                            _self.blur()
                        }
                        src = document.selection.createRange().text;
                        document.selection.empty();
                        obj.hide();
                        obj.parents("li").css({
                            'filter': 'progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)',
                            'width': opts.Width + 'px',
                            'height': opts.Height + 'px'
                        });
                        li.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = src
                    }
                } else {
                    html += '<li onmouseleave="moveOut(this)">';
                	html += '	<div class="upload-content">';
					html += '		<div class="file-panel">';
					html += '			<span class="cancel" onclick="delImg('+fileid+',this)" title="删除"></span>';
					html += '		</div>';
	                html += '		<img src='+_self.getObjectURL(e.files[0])+' onmouseover="moveUp(this)" class="list-img">';
					html += '	</div>';
					html += '</li>';
                }
                uploadList.append(html);
                opts.Callback()
            }else{
            	_this.remove();
            }
        }
        delImg = function(fileId,e){
        	//alert(fileId);
        	//$('#'+fileId).remove();
        	fileId.remove();
        	$(e).parent().parent().parent().remove();
        }
        moveUp = function(e){
        	$(e).siblings(".file-panel").height("30px");
        };
        moveOut = function(e){
        	$(e).find(".file-panel").height("0");
        }
    }
});