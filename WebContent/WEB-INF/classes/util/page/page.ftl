<p class="cutpage">�� ${total} ����¼&nbsp; ÿҳ��ʾ
	<select name="pageSize" onchange="if (this.options[this.selectedIndex].value != '') {
		location = '${url}?<#if numParam != "">${numParam}&</#if>page=${page}&pageSize=' + this.options[this.selectedIndex].value;
	}">
		${numPage}
	</select> ��&nbsp; ��ǰ�� ${page}/${totalPageCount} ҳ&nbsp;
	<#if firstUrl != ""><a href="${firstUrl}">��ҳ</a><#else>��ҳ</#if>&nbsp;
	<#if prevUrl != ""><a href="${prevUrl}">��һҳ</a><#else>��һҳ</#if>&nbsp;
	<#if nextUrl != ""><a href="${nextUrl}">��һҳ</a><#else>��һҳ</#if>&nbsp;
	<#if lastUrl != ""><a href="${lastUrl}">βҳ</a><#else>βҳ</#if>&nbsp;
	��ת��
	<select name="page" onchange="if (this.options[this.selectedIndex].value != '') {
		location = '${url}?<#if param != "">${param}&</#if>page=' + this.options[this.selectedIndex].value;
	}">
		${jumpPage}
	</select>
	ҳ
</p>