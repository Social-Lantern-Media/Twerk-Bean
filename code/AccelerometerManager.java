



<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
 <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
 
 <meta name="ROBOTS" content="NOARCHIVE">
 
 <link rel="icon" type="image/vnd.microsoft.icon" href="https://ssl.gstatic.com/codesite/ph/images/phosting.ico">
 
 
 <script type="text/javascript">
 
 
 
 
 var codesite_token = "ABZ6GAfVHcwicQ_1FpaUmZDoSWJvxhSiww:1418222673527";
 
 
 var CS_env = {"loggedInUserEmail": "matthewdk54@gmail.com", "token": "ABZ6GAfVHcwicQ_1FpaUmZDoSWJvxhSiww:1418222673527", "profileUrl": "/u/106875562245387694310/", "projectHomeUrl": "/p/processing", "projectName": "processing", "assetVersionPath": "https://ssl.gstatic.com/codesite/ph/1729405847801014513", "relativeBaseUrl": "", "assetHostPath": "https://ssl.gstatic.com/codesite/ph", "domainName": null};
 var _gaq = _gaq || [];
 _gaq.push(
 ['siteTracker._setAccount', 'UA-18071-1'],
 ['siteTracker._trackPageview']);
 
 (function() {
 var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
 ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
 (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(ga);
 })();
 
 </script>
 
 
 <title>AccelerometerManager.java - 
 processing -
 
 
 An open source programming language and environment for creating images, animation, and interactions - Google Project Hosting
 </title>
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/1729405847801014513/css/core.css">
 
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/1729405847801014513/css/ph_detail.css" >
 
 
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/1729405847801014513/css/d_sb.css" >
 
 
 
<!--[if IE]>
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/1729405847801014513/css/d_ie.css" >
<![endif]-->
 <style type="text/css">
 .menuIcon.off { background: no-repeat url(https://ssl.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -42px }
 .menuIcon.on { background: no-repeat url(https://ssl.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -28px }
 .menuIcon.down { background: no-repeat url(https://ssl.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 0; }
 
 
 
  tr.inline_comment {
 background: #fff;
 vertical-align: top;
 }
 div.draft, div.published {
 padding: .3em;
 border: 1px solid #999; 
 margin-bottom: .1em;
 font-family: arial, sans-serif;
 max-width: 60em;
 }
 div.draft {
 background: #ffa;
 } 
 div.published {
 background: #e5ecf9;
 }
 div.published .body, div.draft .body {
 padding: .5em .1em .1em .1em;
 max-width: 60em;
 white-space: pre-wrap;
 white-space: -moz-pre-wrap;
 white-space: -pre-wrap;
 white-space: -o-pre-wrap;
 word-wrap: break-word;
 font-size: 1em;
 }
 div.draft .actions {
 margin-left: 1em;
 font-size: 90%;
 }
 div.draft form {
 padding: .5em .5em .5em 0;
 }
 div.draft textarea, div.published textarea {
 width: 95%;
 height: 10em;
 font-family: arial, sans-serif;
 margin-bottom: .5em;
 }

 
 .nocursor, .nocursor td, .cursor_hidden, .cursor_hidden td {
 background-color: white;
 height: 2px;
 }
 .cursor, .cursor td {
 background-color: darkblue;
 height: 2px;
 display: '';
 }
 
 
.list {
 border: 1px solid white;
 border-bottom: 0;
}

 
 </style>
</head>
<body class="t4">
<script type="text/javascript">
 window.___gcfg = {lang: 'en'};
 (function() 
 {var po = document.createElement("script");
 po.type = "text/javascript"; po.async = true;po.src = "https://apis.google.com/js/plusone.js";
 var s = document.getElementsByTagName("script")[0];
 s.parentNode.insertBefore(po, s);
 })();
</script>
<div class="headbg">

 <div id="gaia">
 

 <span>
 
 
 
 <a href="#" id="multilogin-dropdown" onclick="return false;"
 ><u><b>matthewdk54@gmail.com</b></u> <small>&#9660;</small></a>
 
 
 | <a href="/u/106875562245387694310/" id="projects-dropdown" onclick="return false;"
 ><u>My favorites</u> <small>&#9660;</small></a>
 | <a href="/u/106875562245387694310/" onclick="_CS_click('/gb/ph/profile');"
 title="Profile, Updates, and Settings"
 ><u>Profile</u></a>
 | <a href="https://www.google.com/accounts/Logout?continue=https%3A%2F%2Fcode.google.com%2Fp%2Fprocessing%2Fsource%2Fbrowse%2Ftrunk%2Fprocessing%2Fandroid%2Fexamples%2FSensors%2FAccelerometer%2FAccelerometerManager.java%3Fr%3D7743" 
 onclick="_CS_click('/gb/ph/signout');"
 ><u>Sign out</u></a>
 
 </span>

 </div>

 <div class="gbh" style="left: 0pt;"></div>
 <div class="gbh" style="right: 0pt;"></div>
 
 
 <div style="height: 1px"></div>
<!--[if lte IE 7]>
<div style="text-align:center;">
Your version of Internet Explorer is not supported. Try a browser that
contributes to open source, such as <a href="http://www.firefox.com">Firefox</a>,
<a href="http://www.google.com/chrome">Google Chrome</a>, or
<a href="http://code.google.com/chrome/chromeframe/">Google Chrome Frame</a>.
</div>
<![endif]-->



 <table style="padding:0px; margin: 0px 0px 10px 0px; width:100%" cellpadding="0" cellspacing="0"
 itemscope itemtype="http://schema.org/CreativeWork">
 <tr style="height: 58px;">
 
 
 
 <td id="plogo">
 <link itemprop="url" href="/p/processing">
 <a href="/p/processing/">
 
 
 <img src="/p/processing/logo?cct=1374382290"
 alt="Logo" itemprop="image">
 
 </a>
 </td>
 
 <td style="padding-left: 0.5em">
 
 <div id="pname">
 <a href="/p/processing/"><span itemprop="name">processing</span></a>
 </div>
 
 <div id="psum">
 <a id="project_summary_link"
 href="/p/processing/"><span itemprop="description">An open source programming language and environment for creating images, animation, and interactions</span></a>
 
 </div>
 
 
 </td>
 <td style="white-space:nowrap;text-align:right; vertical-align:bottom;">
 
 <form action="/hosting/search">
 <input size="30" name="q" value="" type="text">
 
 <input type="submit" name="projectsearch" value="Search projects" >
 </form>
 
 </tr>
 </table>

</div>

 
<div id="mt" class="gtb"> 
 <a href="/p/processing/" class="tab ">Project&nbsp;Home</a>
 
 
 
 
 <a href="/p/processing/downloads/list" class="tab ">Downloads</a>
 
 
 
 
 
 <a href="/p/processing/w/list" class="tab ">Wiki</a>
 
 
 
 
 
 
 
 
 
 
 
 
 <div class=gtbc></div>
</div>
<table cellspacing="0" cellpadding="0" width="100%" align="center" border="0" class="st">
 <tr>
 
 
 
 
 
 
 <td class="subt">
 <div class="st2">
 <div class="isf">
 
 


 <span class="inst1"><a href="/p/processing/source/checkout">Checkout</a></span> &nbsp;
 <span class="inst2"><a href="/p/processing/source/browse/trunk/processing">Browse</a></span> &nbsp;
 <span class="inst3"><a href="/p/processing/source/list">Changes</a></span> &nbsp;
 
 
 
 
 
 
 
 </form>
 <script type="text/javascript">
 
 function codesearchQuery(form) {
 var query = document.getElementById('q').value;
 if (query) { form.action += '%20' + query; }
 }
 </script>
 </div>
</div>

 </td>
 
 
 
 <td align="right" valign="top" class="bevel-right"></td>
 </tr>
</table>


<script type="text/javascript">
 var cancelBubble = false;
 function _go(url) { document.location = url; }
</script>
<div id="maincol"
 
>

 




<div class="expand">
<div id="colcontrol">
<style type="text/css">
 #file_flipper { white-space: nowrap; padding-right: 2em; }
 #file_flipper.hidden { display: none; }
 #file_flipper .pagelink { color: #0000CC; text-decoration: underline; }
 #file_flipper #visiblefiles { padding-left: 0.5em; padding-right: 0.5em; }
</style>
<table id="nav_and_rev" class="list"
 cellpadding="0" cellspacing="0" width="100%">
 <tr>
 
 <td nowrap="nowrap" class="src_crumbs src_nav" width="33%">
 <strong class="src_nav">Source path:&nbsp;</strong>
 <span id="crumb_root">
 
 <a href="/p/processing/source/browse/?r=7743">svn</a>/&nbsp;</span>
 <span id="crumb_links" class="ifClosed"><a href="/p/processing/source/browse/trunk/?r=7743">trunk</a><span class="sp">/&nbsp;</span><a href="/p/processing/source/browse/trunk/processing/?r=7743">processing</a><span class="sp">/&nbsp;</span><a href="/p/processing/source/browse/trunk/processing/android/?r=7743">android</a><span class="sp">/&nbsp;</span><a href="/p/processing/source/browse/trunk/processing/android/examples/?r=7743">examples</a><span class="sp">/&nbsp;</span><a href="/p/processing/source/browse/trunk/processing/android/examples/Sensors/?r=7743">Sensors</a><span class="sp">/&nbsp;</span><a href="/p/processing/source/browse/trunk/processing/android/examples/Sensors/Accelerometer/?r=7743">Accelerometer</a><span class="sp">/&nbsp;</span>AccelerometerManager.java</span>
 
 


 </td>
 
 
 <td nowrap="nowrap" width="33%" align="right">
 <table cellpadding="0" cellspacing="0" style="font-size: 100%"><tr>
 
 
 <td class="flipper"><b>r7743</b></td>
 
 </tr></table>
 </td> 
 </tr>
</table>

<div class="fc">
 
 
 
<style type="text/css">
.undermouse span {
 background-image: url(https://ssl.gstatic.com/codesite/ph/images/comments.gif); }
</style>
<table class="opened" id="review_comment_area"
><tr>
<td id="nums">
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
<pre><table width="100%" id="nums_table_0"><tr id="gr_svn7743_1"

><td id="1"><a href="#1">1</a></td></tr
><tr id="gr_svn7743_2"

><td id="2"><a href="#2">2</a></td></tr
><tr id="gr_svn7743_3"

><td id="3"><a href="#3">3</a></td></tr
><tr id="gr_svn7743_4"

><td id="4"><a href="#4">4</a></td></tr
><tr id="gr_svn7743_5"

><td id="5"><a href="#5">5</a></td></tr
><tr id="gr_svn7743_6"

><td id="6"><a href="#6">6</a></td></tr
><tr id="gr_svn7743_7"

><td id="7"><a href="#7">7</a></td></tr
><tr id="gr_svn7743_8"

><td id="8"><a href="#8">8</a></td></tr
><tr id="gr_svn7743_9"

><td id="9"><a href="#9">9</a></td></tr
><tr id="gr_svn7743_10"

><td id="10"><a href="#10">10</a></td></tr
><tr id="gr_svn7743_11"

><td id="11"><a href="#11">11</a></td></tr
><tr id="gr_svn7743_12"

><td id="12"><a href="#12">12</a></td></tr
><tr id="gr_svn7743_13"

><td id="13"><a href="#13">13</a></td></tr
><tr id="gr_svn7743_14"

><td id="14"><a href="#14">14</a></td></tr
><tr id="gr_svn7743_15"

><td id="15"><a href="#15">15</a></td></tr
><tr id="gr_svn7743_16"

><td id="16"><a href="#16">16</a></td></tr
><tr id="gr_svn7743_17"

><td id="17"><a href="#17">17</a></td></tr
><tr id="gr_svn7743_18"

><td id="18"><a href="#18">18</a></td></tr
><tr id="gr_svn7743_19"

><td id="19"><a href="#19">19</a></td></tr
><tr id="gr_svn7743_20"

><td id="20"><a href="#20">20</a></td></tr
><tr id="gr_svn7743_21"

><td id="21"><a href="#21">21</a></td></tr
><tr id="gr_svn7743_22"

><td id="22"><a href="#22">22</a></td></tr
><tr id="gr_svn7743_23"

><td id="23"><a href="#23">23</a></td></tr
><tr id="gr_svn7743_24"

><td id="24"><a href="#24">24</a></td></tr
><tr id="gr_svn7743_25"

><td id="25"><a href="#25">25</a></td></tr
><tr id="gr_svn7743_26"

><td id="26"><a href="#26">26</a></td></tr
><tr id="gr_svn7743_27"

><td id="27"><a href="#27">27</a></td></tr
><tr id="gr_svn7743_28"

><td id="28"><a href="#28">28</a></td></tr
><tr id="gr_svn7743_29"

><td id="29"><a href="#29">29</a></td></tr
><tr id="gr_svn7743_30"

><td id="30"><a href="#30">30</a></td></tr
><tr id="gr_svn7743_31"

><td id="31"><a href="#31">31</a></td></tr
><tr id="gr_svn7743_32"

><td id="32"><a href="#32">32</a></td></tr
><tr id="gr_svn7743_33"

><td id="33"><a href="#33">33</a></td></tr
><tr id="gr_svn7743_34"

><td id="34"><a href="#34">34</a></td></tr
><tr id="gr_svn7743_35"

><td id="35"><a href="#35">35</a></td></tr
><tr id="gr_svn7743_36"

><td id="36"><a href="#36">36</a></td></tr
><tr id="gr_svn7743_37"

><td id="37"><a href="#37">37</a></td></tr
><tr id="gr_svn7743_38"

><td id="38"><a href="#38">38</a></td></tr
><tr id="gr_svn7743_39"

><td id="39"><a href="#39">39</a></td></tr
><tr id="gr_svn7743_40"

><td id="40"><a href="#40">40</a></td></tr
><tr id="gr_svn7743_41"

><td id="41"><a href="#41">41</a></td></tr
><tr id="gr_svn7743_42"

><td id="42"><a href="#42">42</a></td></tr
><tr id="gr_svn7743_43"

><td id="43"><a href="#43">43</a></td></tr
><tr id="gr_svn7743_44"

><td id="44"><a href="#44">44</a></td></tr
><tr id="gr_svn7743_45"

><td id="45"><a href="#45">45</a></td></tr
><tr id="gr_svn7743_46"

><td id="46"><a href="#46">46</a></td></tr
><tr id="gr_svn7743_47"

><td id="47"><a href="#47">47</a></td></tr
><tr id="gr_svn7743_48"

><td id="48"><a href="#48">48</a></td></tr
><tr id="gr_svn7743_49"

><td id="49"><a href="#49">49</a></td></tr
><tr id="gr_svn7743_50"

><td id="50"><a href="#50">50</a></td></tr
><tr id="gr_svn7743_51"

><td id="51"><a href="#51">51</a></td></tr
><tr id="gr_svn7743_52"

><td id="52"><a href="#52">52</a></td></tr
><tr id="gr_svn7743_53"

><td id="53"><a href="#53">53</a></td></tr
><tr id="gr_svn7743_54"

><td id="54"><a href="#54">54</a></td></tr
><tr id="gr_svn7743_55"

><td id="55"><a href="#55">55</a></td></tr
><tr id="gr_svn7743_56"

><td id="56"><a href="#56">56</a></td></tr
><tr id="gr_svn7743_57"

><td id="57"><a href="#57">57</a></td></tr
><tr id="gr_svn7743_58"

><td id="58"><a href="#58">58</a></td></tr
><tr id="gr_svn7743_59"

><td id="59"><a href="#59">59</a></td></tr
><tr id="gr_svn7743_60"

><td id="60"><a href="#60">60</a></td></tr
><tr id="gr_svn7743_61"

><td id="61"><a href="#61">61</a></td></tr
><tr id="gr_svn7743_62"

><td id="62"><a href="#62">62</a></td></tr
><tr id="gr_svn7743_63"

><td id="63"><a href="#63">63</a></td></tr
><tr id="gr_svn7743_64"

><td id="64"><a href="#64">64</a></td></tr
><tr id="gr_svn7743_65"

><td id="65"><a href="#65">65</a></td></tr
><tr id="gr_svn7743_66"

><td id="66"><a href="#66">66</a></td></tr
><tr id="gr_svn7743_67"

><td id="67"><a href="#67">67</a></td></tr
><tr id="gr_svn7743_68"

><td id="68"><a href="#68">68</a></td></tr
><tr id="gr_svn7743_69"

><td id="69"><a href="#69">69</a></td></tr
><tr id="gr_svn7743_70"

><td id="70"><a href="#70">70</a></td></tr
><tr id="gr_svn7743_71"

><td id="71"><a href="#71">71</a></td></tr
><tr id="gr_svn7743_72"

><td id="72"><a href="#72">72</a></td></tr
><tr id="gr_svn7743_73"

><td id="73"><a href="#73">73</a></td></tr
><tr id="gr_svn7743_74"

><td id="74"><a href="#74">74</a></td></tr
><tr id="gr_svn7743_75"

><td id="75"><a href="#75">75</a></td></tr
><tr id="gr_svn7743_76"

><td id="76"><a href="#76">76</a></td></tr
><tr id="gr_svn7743_77"

><td id="77"><a href="#77">77</a></td></tr
><tr id="gr_svn7743_78"

><td id="78"><a href="#78">78</a></td></tr
><tr id="gr_svn7743_79"

><td id="79"><a href="#79">79</a></td></tr
><tr id="gr_svn7743_80"

><td id="80"><a href="#80">80</a></td></tr
><tr id="gr_svn7743_81"

><td id="81"><a href="#81">81</a></td></tr
><tr id="gr_svn7743_82"

><td id="82"><a href="#82">82</a></td></tr
><tr id="gr_svn7743_83"

><td id="83"><a href="#83">83</a></td></tr
><tr id="gr_svn7743_84"

><td id="84"><a href="#84">84</a></td></tr
><tr id="gr_svn7743_85"

><td id="85"><a href="#85">85</a></td></tr
><tr id="gr_svn7743_86"

><td id="86"><a href="#86">86</a></td></tr
><tr id="gr_svn7743_87"

><td id="87"><a href="#87">87</a></td></tr
><tr id="gr_svn7743_88"

><td id="88"><a href="#88">88</a></td></tr
><tr id="gr_svn7743_89"

><td id="89"><a href="#89">89</a></td></tr
><tr id="gr_svn7743_90"

><td id="90"><a href="#90">90</a></td></tr
><tr id="gr_svn7743_91"

><td id="91"><a href="#91">91</a></td></tr
><tr id="gr_svn7743_92"

><td id="92"><a href="#92">92</a></td></tr
><tr id="gr_svn7743_93"

><td id="93"><a href="#93">93</a></td></tr
><tr id="gr_svn7743_94"

><td id="94"><a href="#94">94</a></td></tr
><tr id="gr_svn7743_95"

><td id="95"><a href="#95">95</a></td></tr
><tr id="gr_svn7743_96"

><td id="96"><a href="#96">96</a></td></tr
><tr id="gr_svn7743_97"

><td id="97"><a href="#97">97</a></td></tr
><tr id="gr_svn7743_98"

><td id="98"><a href="#98">98</a></td></tr
><tr id="gr_svn7743_99"

><td id="99"><a href="#99">99</a></td></tr
><tr id="gr_svn7743_100"

><td id="100"><a href="#100">100</a></td></tr
><tr id="gr_svn7743_101"

><td id="101"><a href="#101">101</a></td></tr
><tr id="gr_svn7743_102"

><td id="102"><a href="#102">102</a></td></tr
><tr id="gr_svn7743_103"

><td id="103"><a href="#103">103</a></td></tr
><tr id="gr_svn7743_104"

><td id="104"><a href="#104">104</a></td></tr
><tr id="gr_svn7743_105"

><td id="105"><a href="#105">105</a></td></tr
><tr id="gr_svn7743_106"

><td id="106"><a href="#106">106</a></td></tr
><tr id="gr_svn7743_107"

><td id="107"><a href="#107">107</a></td></tr
><tr id="gr_svn7743_108"

><td id="108"><a href="#108">108</a></td></tr
><tr id="gr_svn7743_109"

><td id="109"><a href="#109">109</a></td></tr
><tr id="gr_svn7743_110"

><td id="110"><a href="#110">110</a></td></tr
><tr id="gr_svn7743_111"

><td id="111"><a href="#111">111</a></td></tr
><tr id="gr_svn7743_112"

><td id="112"><a href="#112">112</a></td></tr
><tr id="gr_svn7743_113"

><td id="113"><a href="#113">113</a></td></tr
><tr id="gr_svn7743_114"

><td id="114"><a href="#114">114</a></td></tr
><tr id="gr_svn7743_115"

><td id="115"><a href="#115">115</a></td></tr
><tr id="gr_svn7743_116"

><td id="116"><a href="#116">116</a></td></tr
><tr id="gr_svn7743_117"

><td id="117"><a href="#117">117</a></td></tr
><tr id="gr_svn7743_118"

><td id="118"><a href="#118">118</a></td></tr
><tr id="gr_svn7743_119"

><td id="119"><a href="#119">119</a></td></tr
><tr id="gr_svn7743_120"

><td id="120"><a href="#120">120</a></td></tr
><tr id="gr_svn7743_121"

><td id="121"><a href="#121">121</a></td></tr
><tr id="gr_svn7743_122"

><td id="122"><a href="#122">122</a></td></tr
><tr id="gr_svn7743_123"

><td id="123"><a href="#123">123</a></td></tr
><tr id="gr_svn7743_124"

><td id="124"><a href="#124">124</a></td></tr
><tr id="gr_svn7743_125"

><td id="125"><a href="#125">125</a></td></tr
><tr id="gr_svn7743_126"

><td id="126"><a href="#126">126</a></td></tr
><tr id="gr_svn7743_127"

><td id="127"><a href="#127">127</a></td></tr
><tr id="gr_svn7743_128"

><td id="128"><a href="#128">128</a></td></tr
><tr id="gr_svn7743_129"

><td id="129"><a href="#129">129</a></td></tr
><tr id="gr_svn7743_130"

><td id="130"><a href="#130">130</a></td></tr
><tr id="gr_svn7743_131"

><td id="131"><a href="#131">131</a></td></tr
><tr id="gr_svn7743_132"

><td id="132"><a href="#132">132</a></td></tr
><tr id="gr_svn7743_133"

><td id="133"><a href="#133">133</a></td></tr
><tr id="gr_svn7743_134"

><td id="134"><a href="#134">134</a></td></tr
><tr id="gr_svn7743_135"

><td id="135"><a href="#135">135</a></td></tr
><tr id="gr_svn7743_136"

><td id="136"><a href="#136">136</a></td></tr
><tr id="gr_svn7743_137"

><td id="137"><a href="#137">137</a></td></tr
><tr id="gr_svn7743_138"

><td id="138"><a href="#138">138</a></td></tr
><tr id="gr_svn7743_139"

><td id="139"><a href="#139">139</a></td></tr
><tr id="gr_svn7743_140"

><td id="140"><a href="#140">140</a></td></tr
><tr id="gr_svn7743_141"

><td id="141"><a href="#141">141</a></td></tr
><tr id="gr_svn7743_142"

><td id="142"><a href="#142">142</a></td></tr
><tr id="gr_svn7743_143"

><td id="143"><a href="#143">143</a></td></tr
><tr id="gr_svn7743_144"

><td id="144"><a href="#144">144</a></td></tr
><tr id="gr_svn7743_145"

><td id="145"><a href="#145">145</a></td></tr
><tr id="gr_svn7743_146"

><td id="146"><a href="#146">146</a></td></tr
><tr id="gr_svn7743_147"

><td id="147"><a href="#147">147</a></td></tr
><tr id="gr_svn7743_148"

><td id="148"><a href="#148">148</a></td></tr
><tr id="gr_svn7743_149"

><td id="149"><a href="#149">149</a></td></tr
><tr id="gr_svn7743_150"

><td id="150"><a href="#150">150</a></td></tr
><tr id="gr_svn7743_151"

><td id="151"><a href="#151">151</a></td></tr
><tr id="gr_svn7743_152"

><td id="152"><a href="#152">152</a></td></tr
><tr id="gr_svn7743_153"

><td id="153"><a href="#153">153</a></td></tr
><tr id="gr_svn7743_154"

><td id="154"><a href="#154">154</a></td></tr
><tr id="gr_svn7743_155"

><td id="155"><a href="#155">155</a></td></tr
><tr id="gr_svn7743_156"

><td id="156"><a href="#156">156</a></td></tr
><tr id="gr_svn7743_157"

><td id="157"><a href="#157">157</a></td></tr
><tr id="gr_svn7743_158"

><td id="158"><a href="#158">158</a></td></tr
><tr id="gr_svn7743_159"

><td id="159"><a href="#159">159</a></td></tr
><tr id="gr_svn7743_160"

><td id="160"><a href="#160">160</a></td></tr
><tr id="gr_svn7743_161"

><td id="161"><a href="#161">161</a></td></tr
><tr id="gr_svn7743_162"

><td id="162"><a href="#162">162</a></td></tr
><tr id="gr_svn7743_163"

><td id="163"><a href="#163">163</a></td></tr
><tr id="gr_svn7743_164"

><td id="164"><a href="#164">164</a></td></tr
><tr id="gr_svn7743_165"

><td id="165"><a href="#165">165</a></td></tr
><tr id="gr_svn7743_166"

><td id="166"><a href="#166">166</a></td></tr
><tr id="gr_svn7743_167"

><td id="167"><a href="#167">167</a></td></tr
><tr id="gr_svn7743_168"

><td id="168"><a href="#168">168</a></td></tr
><tr id="gr_svn7743_169"

><td id="169"><a href="#169">169</a></td></tr
><tr id="gr_svn7743_170"

><td id="170"><a href="#170">170</a></td></tr
><tr id="gr_svn7743_171"

><td id="171"><a href="#171">171</a></td></tr
><tr id="gr_svn7743_172"

><td id="172"><a href="#172">172</a></td></tr
><tr id="gr_svn7743_173"

><td id="173"><a href="#173">173</a></td></tr
><tr id="gr_svn7743_174"

><td id="174"><a href="#174">174</a></td></tr
><tr id="gr_svn7743_175"

><td id="175"><a href="#175">175</a></td></tr
><tr id="gr_svn7743_176"

><td id="176"><a href="#176">176</a></td></tr
><tr id="gr_svn7743_177"

><td id="177"><a href="#177">177</a></td></tr
><tr id="gr_svn7743_178"

><td id="178"><a href="#178">178</a></td></tr
><tr id="gr_svn7743_179"

><td id="179"><a href="#179">179</a></td></tr
><tr id="gr_svn7743_180"

><td id="180"><a href="#180">180</a></td></tr
><tr id="gr_svn7743_181"

><td id="181"><a href="#181">181</a></td></tr
><tr id="gr_svn7743_182"

><td id="182"><a href="#182">182</a></td></tr
><tr id="gr_svn7743_183"

><td id="183"><a href="#183">183</a></td></tr
><tr id="gr_svn7743_184"

><td id="184"><a href="#184">184</a></td></tr
><tr id="gr_svn7743_185"

><td id="185"><a href="#185">185</a></td></tr
><tr id="gr_svn7743_186"

><td id="186"><a href="#186">186</a></td></tr
><tr id="gr_svn7743_187"

><td id="187"><a href="#187">187</a></td></tr
><tr id="gr_svn7743_188"

><td id="188"><a href="#188">188</a></td></tr
><tr id="gr_svn7743_189"

><td id="189"><a href="#189">189</a></td></tr
><tr id="gr_svn7743_190"

><td id="190"><a href="#190">190</a></td></tr
><tr id="gr_svn7743_191"

><td id="191"><a href="#191">191</a></td></tr
><tr id="gr_svn7743_192"

><td id="192"><a href="#192">192</a></td></tr
><tr id="gr_svn7743_193"

><td id="193"><a href="#193">193</a></td></tr
><tr id="gr_svn7743_194"

><td id="194"><a href="#194">194</a></td></tr
><tr id="gr_svn7743_195"

><td id="195"><a href="#195">195</a></td></tr
><tr id="gr_svn7743_196"

><td id="196"><a href="#196">196</a></td></tr
><tr id="gr_svn7743_197"

><td id="197"><a href="#197">197</a></td></tr
><tr id="gr_svn7743_198"

><td id="198"><a href="#198">198</a></td></tr
><tr id="gr_svn7743_199"

><td id="199"><a href="#199">199</a></td></tr
><tr id="gr_svn7743_200"

><td id="200"><a href="#200">200</a></td></tr
><tr id="gr_svn7743_201"

><td id="201"><a href="#201">201</a></td></tr
><tr id="gr_svn7743_202"

><td id="202"><a href="#202">202</a></td></tr
><tr id="gr_svn7743_203"

><td id="203"><a href="#203">203</a></td></tr
><tr id="gr_svn7743_204"

><td id="204"><a href="#204">204</a></td></tr
><tr id="gr_svn7743_205"

><td id="205"><a href="#205">205</a></td></tr
><tr id="gr_svn7743_206"

><td id="206"><a href="#206">206</a></td></tr
><tr id="gr_svn7743_207"

><td id="207"><a href="#207">207</a></td></tr
><tr id="gr_svn7743_208"

><td id="208"><a href="#208">208</a></td></tr
><tr id="gr_svn7743_209"

><td id="209"><a href="#209">209</a></td></tr
><tr id="gr_svn7743_210"

><td id="210"><a href="#210">210</a></td></tr
><tr id="gr_svn7743_211"

><td id="211"><a href="#211">211</a></td></tr
><tr id="gr_svn7743_212"

><td id="212"><a href="#212">212</a></td></tr
><tr id="gr_svn7743_213"

><td id="213"><a href="#213">213</a></td></tr
><tr id="gr_svn7743_214"

><td id="214"><a href="#214">214</a></td></tr
><tr id="gr_svn7743_215"

><td id="215"><a href="#215">215</a></td></tr
><tr id="gr_svn7743_216"

><td id="216"><a href="#216">216</a></td></tr
><tr id="gr_svn7743_217"

><td id="217"><a href="#217">217</a></td></tr
><tr id="gr_svn7743_218"

><td id="218"><a href="#218">218</a></td></tr
><tr id="gr_svn7743_219"

><td id="219"><a href="#219">219</a></td></tr
><tr id="gr_svn7743_220"

><td id="220"><a href="#220">220</a></td></tr
><tr id="gr_svn7743_221"

><td id="221"><a href="#221">221</a></td></tr
><tr id="gr_svn7743_222"

><td id="222"><a href="#222">222</a></td></tr
><tr id="gr_svn7743_223"

><td id="223"><a href="#223">223</a></td></tr
><tr id="gr_svn7743_224"

><td id="224"><a href="#224">224</a></td></tr
><tr id="gr_svn7743_225"

><td id="225"><a href="#225">225</a></td></tr
><tr id="gr_svn7743_226"

><td id="226"><a href="#226">226</a></td></tr
><tr id="gr_svn7743_227"

><td id="227"><a href="#227">227</a></td></tr
><tr id="gr_svn7743_228"

><td id="228"><a href="#228">228</a></td></tr
><tr id="gr_svn7743_229"

><td id="229"><a href="#229">229</a></td></tr
><tr id="gr_svn7743_230"

><td id="230"><a href="#230">230</a></td></tr
><tr id="gr_svn7743_231"

><td id="231"><a href="#231">231</a></td></tr
><tr id="gr_svn7743_232"

><td id="232"><a href="#232">232</a></td></tr
><tr id="gr_svn7743_233"

><td id="233"><a href="#233">233</a></td></tr
><tr id="gr_svn7743_234"

><td id="234"><a href="#234">234</a></td></tr
><tr id="gr_svn7743_235"

><td id="235"><a href="#235">235</a></td></tr
><tr id="gr_svn7743_236"

><td id="236"><a href="#236">236</a></td></tr
><tr id="gr_svn7743_237"

><td id="237"><a href="#237">237</a></td></tr
><tr id="gr_svn7743_238"

><td id="238"><a href="#238">238</a></td></tr
><tr id="gr_svn7743_239"

><td id="239"><a href="#239">239</a></td></tr
><tr id="gr_svn7743_240"

><td id="240"><a href="#240">240</a></td></tr
><tr id="gr_svn7743_241"

><td id="241"><a href="#241">241</a></td></tr
><tr id="gr_svn7743_242"

><td id="242"><a href="#242">242</a></td></tr
></table></pre>
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
</td>
<td id="lines">
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
<pre class="prettyprint lang-java"><table id="src_table_0"><tr
id=sl_svn7743_1

><td class="source">import java.lang.reflect.*;<br></td></tr
><tr
id=sl_svn7743_2

><td class="source">import java.util.List;<br></td></tr
><tr
id=sl_svn7743_3

><td class="source"><br></td></tr
><tr
id=sl_svn7743_4

><td class="source">import android.content.Context;<br></td></tr
><tr
id=sl_svn7743_5

><td class="source">import android.hardware.Sensor;<br></td></tr
><tr
id=sl_svn7743_6

><td class="source">import android.hardware.SensorEvent;<br></td></tr
><tr
id=sl_svn7743_7

><td class="source">import android.hardware.SensorEventListener;<br></td></tr
><tr
id=sl_svn7743_8

><td class="source">import android.hardware.SensorManager;<br></td></tr
><tr
id=sl_svn7743_9

><td class="source"><br></td></tr
><tr
id=sl_svn7743_10

><td class="source"><br></td></tr
><tr
id=sl_svn7743_11

><td class="source">/**<br></td></tr
><tr
id=sl_svn7743_12

><td class="source"> * Android Accelerometer Sensor Manager Archetype<br></td></tr
><tr
id=sl_svn7743_13

><td class="source"> * @author antoine vianey<br></td></tr
><tr
id=sl_svn7743_14

><td class="source"> * under GPL v3 : http://www.gnu.org/licenses/gpl-3.0.html<br></td></tr
><tr
id=sl_svn7743_15

><td class="source"> */<br></td></tr
><tr
id=sl_svn7743_16

><td class="source">public class AccelerometerManager {<br></td></tr
><tr
id=sl_svn7743_17

><td class="source">  /** Accuracy configuration */<br></td></tr
><tr
id=sl_svn7743_18

><td class="source">  private float threshold = 0.2f;<br></td></tr
><tr
id=sl_svn7743_19

><td class="source">  private int interval = 1000;<br></td></tr
><tr
id=sl_svn7743_20

><td class="source"><br></td></tr
><tr
id=sl_svn7743_21

><td class="source">  private Sensor sensor;<br></td></tr
><tr
id=sl_svn7743_22

><td class="source">  private SensorManager sensorManager;<br></td></tr
><tr
id=sl_svn7743_23

><td class="source">  // you could use an OrientationListener array instead<br></td></tr
><tr
id=sl_svn7743_24

><td class="source">  // if you plans to use more than one listener<br></td></tr
><tr
id=sl_svn7743_25

><td class="source">//  private AccelerometerListener listener;<br></td></tr
><tr
id=sl_svn7743_26

><td class="source"><br></td></tr
><tr
id=sl_svn7743_27

><td class="source">  Method shakeEventMethod;<br></td></tr
><tr
id=sl_svn7743_28

><td class="source">  Method accelerationEventMethod;<br></td></tr
><tr
id=sl_svn7743_29

><td class="source"><br></td></tr
><tr
id=sl_svn7743_30

><td class="source">  /** indicates whether or not Accelerometer Sensor is supported */<br></td></tr
><tr
id=sl_svn7743_31

><td class="source">  private Boolean supported;<br></td></tr
><tr
id=sl_svn7743_32

><td class="source">  /** indicates whether or not Accelerometer Sensor is running */<br></td></tr
><tr
id=sl_svn7743_33

><td class="source">  private boolean running = false;<br></td></tr
><tr
id=sl_svn7743_34

><td class="source"><br></td></tr
><tr
id=sl_svn7743_35

><td class="source">  Context context;<br></td></tr
><tr
id=sl_svn7743_36

><td class="source"><br></td></tr
><tr
id=sl_svn7743_37

><td class="source"><br></td></tr
><tr
id=sl_svn7743_38

><td class="source">  public AccelerometerManager(Context parent) {<br></td></tr
><tr
id=sl_svn7743_39

><td class="source">    this.context = parent;<br></td></tr
><tr
id=sl_svn7743_40

><td class="source">    <br></td></tr
><tr
id=sl_svn7743_41

><td class="source">    try {<br></td></tr
><tr
id=sl_svn7743_42

><td class="source">      shakeEventMethod =<br></td></tr
><tr
id=sl_svn7743_43

><td class="source">        parent.getClass().getMethod(&quot;shakeEvent&quot;, new Class[] { Float.TYPE });<br></td></tr
><tr
id=sl_svn7743_44

><td class="source">    } catch (Exception e) {<br></td></tr
><tr
id=sl_svn7743_45

><td class="source">      // no such method, or an error.. which is fine, just ignore<br></td></tr
><tr
id=sl_svn7743_46

><td class="source">    }<br></td></tr
><tr
id=sl_svn7743_47

><td class="source"><br></td></tr
><tr
id=sl_svn7743_48

><td class="source">    try {<br></td></tr
><tr
id=sl_svn7743_49

><td class="source">      accelerationEventMethod =<br></td></tr
><tr
id=sl_svn7743_50

><td class="source">        parent.getClass().getMethod(&quot;accelerationEvent&quot;, new Class[] { Float.TYPE, Float.TYPE, Float.TYPE });<br></td></tr
><tr
id=sl_svn7743_51

><td class="source">    } catch (Exception e) {<br></td></tr
><tr
id=sl_svn7743_52

><td class="source">      // no such method, or an error.. which is fine, just ignore<br></td></tr
><tr
id=sl_svn7743_53

><td class="source">    }<br></td></tr
><tr
id=sl_svn7743_54

><td class="source">//    System.out.println(&quot;shakeEventMethod is &quot; + shakeEventMethod);<br></td></tr
><tr
id=sl_svn7743_55

><td class="source">//    System.out.println(&quot;accelerationEventMethod is &quot; + accelerationEventMethod);<br></td></tr
><tr
id=sl_svn7743_56

><td class="source">    resume();<br></td></tr
><tr
id=sl_svn7743_57

><td class="source">  }<br></td></tr
><tr
id=sl_svn7743_58

><td class="source"><br></td></tr
><tr
id=sl_svn7743_59

><td class="source"><br></td></tr
><tr
id=sl_svn7743_60

><td class="source">  public AccelerometerManager(Context context, int threshold, int interval) {<br></td></tr
><tr
id=sl_svn7743_61

><td class="source">    this(context);<br></td></tr
><tr
id=sl_svn7743_62

><td class="source">    this.threshold = threshold;<br></td></tr
><tr
id=sl_svn7743_63

><td class="source">    this.interval = interval;<br></td></tr
><tr
id=sl_svn7743_64

><td class="source">  }<br></td></tr
><tr
id=sl_svn7743_65

><td class="source"><br></td></tr
><tr
id=sl_svn7743_66

><td class="source"><br></td></tr
><tr
id=sl_svn7743_67

><td class="source">  public void resume() {<br></td></tr
><tr
id=sl_svn7743_68

><td class="source">    if (isSupported()) {<br></td></tr
><tr
id=sl_svn7743_69

><td class="source">      startListening();<br></td></tr
><tr
id=sl_svn7743_70

><td class="source">    }<br></td></tr
><tr
id=sl_svn7743_71

><td class="source">  }<br></td></tr
><tr
id=sl_svn7743_72

><td class="source">  <br></td></tr
><tr
id=sl_svn7743_73

><td class="source">  <br></td></tr
><tr
id=sl_svn7743_74

><td class="source">  public void pause() {<br></td></tr
><tr
id=sl_svn7743_75

><td class="source">    if (isListening()) {<br></td></tr
><tr
id=sl_svn7743_76

><td class="source">      stopListening();<br></td></tr
><tr
id=sl_svn7743_77

><td class="source">    }<br></td></tr
><tr
id=sl_svn7743_78

><td class="source">  }<br></td></tr
><tr
id=sl_svn7743_79

><td class="source"><br></td></tr
><tr
id=sl_svn7743_80

><td class="source"><br></td></tr
><tr
id=sl_svn7743_81

><td class="source">  /**<br></td></tr
><tr
id=sl_svn7743_82

><td class="source">   * Returns true if the manager is listening to orientation changes<br></td></tr
><tr
id=sl_svn7743_83

><td class="source">   */<br></td></tr
><tr
id=sl_svn7743_84

><td class="source">  public boolean isListening() {<br></td></tr
><tr
id=sl_svn7743_85

><td class="source">    return running;<br></td></tr
><tr
id=sl_svn7743_86

><td class="source">  }<br></td></tr
><tr
id=sl_svn7743_87

><td class="source"><br></td></tr
><tr
id=sl_svn7743_88

><td class="source"><br></td></tr
><tr
id=sl_svn7743_89

><td class="source">  /**<br></td></tr
><tr
id=sl_svn7743_90

><td class="source">   * Unregisters listeners<br></td></tr
><tr
id=sl_svn7743_91

><td class="source">   */<br></td></tr
><tr
id=sl_svn7743_92

><td class="source">  public void stopListening() {<br></td></tr
><tr
id=sl_svn7743_93

><td class="source">    running = false;<br></td></tr
><tr
id=sl_svn7743_94

><td class="source">    try {<br></td></tr
><tr
id=sl_svn7743_95

><td class="source">      if (sensorManager != null &amp;&amp; sensorEventListener != null) {<br></td></tr
><tr
id=sl_svn7743_96

><td class="source">        sensorManager.unregisterListener(sensorEventListener);<br></td></tr
><tr
id=sl_svn7743_97

><td class="source">      }<br></td></tr
><tr
id=sl_svn7743_98

><td class="source">    } <br></td></tr
><tr
id=sl_svn7743_99

><td class="source">    catch (Exception e) {<br></td></tr
><tr
id=sl_svn7743_100

><td class="source">    }<br></td></tr
><tr
id=sl_svn7743_101

><td class="source">  }<br></td></tr
><tr
id=sl_svn7743_102

><td class="source"><br></td></tr
><tr
id=sl_svn7743_103

><td class="source"><br></td></tr
><tr
id=sl_svn7743_104

><td class="source">  /**<br></td></tr
><tr
id=sl_svn7743_105

><td class="source">   * Returns true if at least one Accelerometer sensor is available<br></td></tr
><tr
id=sl_svn7743_106

><td class="source">   */<br></td></tr
><tr
id=sl_svn7743_107

><td class="source">  public boolean isSupported() {<br></td></tr
><tr
id=sl_svn7743_108

><td class="source">    if (supported == null) {<br></td></tr
><tr
id=sl_svn7743_109

><td class="source">      sensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);<br></td></tr
><tr
id=sl_svn7743_110

><td class="source">      List&lt;Sensor&gt; sensors = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);<br></td></tr
><tr
id=sl_svn7743_111

><td class="source">      supported = new Boolean(sensors.size() &gt; 0);<br></td></tr
><tr
id=sl_svn7743_112

><td class="source">    }<br></td></tr
><tr
id=sl_svn7743_113

><td class="source">    return supported;<br></td></tr
><tr
id=sl_svn7743_114

><td class="source">  }<br></td></tr
><tr
id=sl_svn7743_115

><td class="source"><br></td></tr
><tr
id=sl_svn7743_116

><td class="source"><br></td></tr
><tr
id=sl_svn7743_117

><td class="source">//  /**<br></td></tr
><tr
id=sl_svn7743_118

><td class="source">//   * Configure the listener for shaking<br></td></tr
><tr
id=sl_svn7743_119

><td class="source">//   * @param threshold<br></td></tr
><tr
id=sl_svn7743_120

><td class="source">//   * 			minimum acceleration variation for considering shaking<br></td></tr
><tr
id=sl_svn7743_121

><td class="source">//   * @param interval<br></td></tr
><tr
id=sl_svn7743_122

><td class="source">//   * 			minimum interval between to shake events<br></td></tr
><tr
id=sl_svn7743_123

><td class="source">//   */<br></td></tr
><tr
id=sl_svn7743_124

><td class="source">//  public static void configure(int threshold, int interval) {<br></td></tr
><tr
id=sl_svn7743_125

><td class="source">//    AccelerometerManager.threshold = threshold;<br></td></tr
><tr
id=sl_svn7743_126

><td class="source">//    AccelerometerManager.interval = interval;<br></td></tr
><tr
id=sl_svn7743_127

><td class="source">//  }<br></td></tr
><tr
id=sl_svn7743_128

><td class="source"><br></td></tr
><tr
id=sl_svn7743_129

><td class="source"><br></td></tr
><tr
id=sl_svn7743_130

><td class="source">  /**<br></td></tr
><tr
id=sl_svn7743_131

><td class="source">   * Registers a listener and start listening<br></td></tr
><tr
id=sl_svn7743_132

><td class="source">   * @param accelerometerListener callback for accelerometer events<br></td></tr
><tr
id=sl_svn7743_133

><td class="source">   */<br></td></tr
><tr
id=sl_svn7743_134

><td class="source">  public void startListening() {<br></td></tr
><tr
id=sl_svn7743_135

><td class="source">//    AccelerometerListener accelerometerListener = (AccelerometerListener) context;<br></td></tr
><tr
id=sl_svn7743_136

><td class="source">    sensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);<br></td></tr
><tr
id=sl_svn7743_137

><td class="source">    List&lt;Sensor&gt; sensors = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);<br></td></tr
><tr
id=sl_svn7743_138

><td class="source">    if (sensors.size() &gt; 0) {<br></td></tr
><tr
id=sl_svn7743_139

><td class="source">      sensor = sensors.get(0);<br></td></tr
><tr
id=sl_svn7743_140

><td class="source">      running = sensorManager.registerListener(sensorEventListener, sensor, SensorManager.SENSOR_DELAY_GAME);<br></td></tr
><tr
id=sl_svn7743_141

><td class="source">//      listener = accelerometerListener;<br></td></tr
><tr
id=sl_svn7743_142

><td class="source">    }<br></td></tr
><tr
id=sl_svn7743_143

><td class="source">  }<br></td></tr
><tr
id=sl_svn7743_144

><td class="source"><br></td></tr
><tr
id=sl_svn7743_145

><td class="source"><br></td></tr
><tr
id=sl_svn7743_146

><td class="source">//  /**<br></td></tr
><tr
id=sl_svn7743_147

><td class="source">//   * Configures threshold and interval<br></td></tr
><tr
id=sl_svn7743_148

><td class="source">//   * And registers a listener and start listening<br></td></tr
><tr
id=sl_svn7743_149

><td class="source">//   * @param accelerometerListener<br></td></tr
><tr
id=sl_svn7743_150

><td class="source">//   * 			callback for accelerometer events<br></td></tr
><tr
id=sl_svn7743_151

><td class="source">//   * @param threshold<br></td></tr
><tr
id=sl_svn7743_152

><td class="source">//   * 			minimum acceleration variation for considering shaking<br></td></tr
><tr
id=sl_svn7743_153

><td class="source">//   * @param interval<br></td></tr
><tr
id=sl_svn7743_154

><td class="source">//   * 			minimum interval between to shake events<br></td></tr
><tr
id=sl_svn7743_155

><td class="source">//   */<br></td></tr
><tr
id=sl_svn7743_156

><td class="source">//  public void startListening(int threshold, int interval) {<br></td></tr
><tr
id=sl_svn7743_157

><td class="source">//    configure(threshold, interval);<br></td></tr
><tr
id=sl_svn7743_158

><td class="source">//    startListening();<br></td></tr
><tr
id=sl_svn7743_159

><td class="source">//  }<br></td></tr
><tr
id=sl_svn7743_160

><td class="source"><br></td></tr
><tr
id=sl_svn7743_161

><td class="source"><br></td></tr
><tr
id=sl_svn7743_162

><td class="source">  /**<br></td></tr
><tr
id=sl_svn7743_163

><td class="source">   * The listener that listen to events from the accelerometer listener<br></td></tr
><tr
id=sl_svn7743_164

><td class="source">   */<br></td></tr
><tr
id=sl_svn7743_165

><td class="source">  //private static SensorEventListener sensorEventListener = new SensorEventListener() {<br></td></tr
><tr
id=sl_svn7743_166

><td class="source">  private SensorEventListener sensorEventListener = new SensorEventListener() {<br></td></tr
><tr
id=sl_svn7743_167

><td class="source">    private long now = 0;<br></td></tr
><tr
id=sl_svn7743_168

><td class="source">    private long timeDiff = 0;<br></td></tr
><tr
id=sl_svn7743_169

><td class="source">    private long lastUpdate = 0;<br></td></tr
><tr
id=sl_svn7743_170

><td class="source">    private long lastShake = 0;<br></td></tr
><tr
id=sl_svn7743_171

><td class="source"><br></td></tr
><tr
id=sl_svn7743_172

><td class="source">    private float x = 0;<br></td></tr
><tr
id=sl_svn7743_173

><td class="source">    private float y = 0;<br></td></tr
><tr
id=sl_svn7743_174

><td class="source">    private float z = 0;<br></td></tr
><tr
id=sl_svn7743_175

><td class="source">    private float lastX = 0;<br></td></tr
><tr
id=sl_svn7743_176

><td class="source">    private float lastY = 0;<br></td></tr
><tr
id=sl_svn7743_177

><td class="source">    private float lastZ = 0;<br></td></tr
><tr
id=sl_svn7743_178

><td class="source">    private float force = 0;<br></td></tr
><tr
id=sl_svn7743_179

><td class="source"><br></td></tr
><tr
id=sl_svn7743_180

><td class="source">    public void onAccuracyChanged(Sensor sensor, int accuracy) {<br></td></tr
><tr
id=sl_svn7743_181

><td class="source">    }<br></td></tr
><tr
id=sl_svn7743_182

><td class="source"><br></td></tr
><tr
id=sl_svn7743_183

><td class="source">    public void onSensorChanged(SensorEvent event) {<br></td></tr
><tr
id=sl_svn7743_184

><td class="source">      // use the event timestamp as reference<br></td></tr
><tr
id=sl_svn7743_185

><td class="source">      // so the manager precision won&#39;t depends <br></td></tr
><tr
id=sl_svn7743_186

><td class="source">      // on the AccelerometerListener implementation<br></td></tr
><tr
id=sl_svn7743_187

><td class="source">      // processing time<br></td></tr
><tr
id=sl_svn7743_188

><td class="source">      now = event.timestamp;<br></td></tr
><tr
id=sl_svn7743_189

><td class="source"><br></td></tr
><tr
id=sl_svn7743_190

><td class="source">      x = event.values[0];<br></td></tr
><tr
id=sl_svn7743_191

><td class="source">      y = event.values[1];<br></td></tr
><tr
id=sl_svn7743_192

><td class="source">      z = event.values[2];<br></td></tr
><tr
id=sl_svn7743_193

><td class="source"><br></td></tr
><tr
id=sl_svn7743_194

><td class="source">      // if not interesting in shake events<br></td></tr
><tr
id=sl_svn7743_195

><td class="source">      // just remove the whole if then else bloc<br></td></tr
><tr
id=sl_svn7743_196

><td class="source">      if (lastUpdate == 0) {<br></td></tr
><tr
id=sl_svn7743_197

><td class="source">        lastUpdate = now;<br></td></tr
><tr
id=sl_svn7743_198

><td class="source">        lastShake = now;<br></td></tr
><tr
id=sl_svn7743_199

><td class="source">        lastX = x;<br></td></tr
><tr
id=sl_svn7743_200

><td class="source">        lastY = y;<br></td></tr
><tr
id=sl_svn7743_201

><td class="source">        lastZ = z;<br></td></tr
><tr
id=sl_svn7743_202

><td class="source"><br></td></tr
><tr
id=sl_svn7743_203

><td class="source">      } else {<br></td></tr
><tr
id=sl_svn7743_204

><td class="source">        timeDiff = now - lastUpdate;<br></td></tr
><tr
id=sl_svn7743_205

><td class="source">        if (timeDiff &gt; 0) {<br></td></tr
><tr
id=sl_svn7743_206

><td class="source">          force = Math.abs(x + y + z - lastX - lastY - lastZ) <br></td></tr
><tr
id=sl_svn7743_207

><td class="source">            / timeDiff;<br></td></tr
><tr
id=sl_svn7743_208

><td class="source">          if (force &gt; threshold) {<br></td></tr
><tr
id=sl_svn7743_209

><td class="source">            if (now - lastShake &gt;= interval) {<br></td></tr
><tr
id=sl_svn7743_210

><td class="source">              // trigger shake event<br></td></tr
><tr
id=sl_svn7743_211

><td class="source">//              listener.onShake(force);<br></td></tr
><tr
id=sl_svn7743_212

><td class="source">              if (shakeEventMethod != null) {<br></td></tr
><tr
id=sl_svn7743_213

><td class="source">                try {<br></td></tr
><tr
id=sl_svn7743_214

><td class="source">                  shakeEventMethod.invoke(context, new Object[] { new Float(force) });<br></td></tr
><tr
id=sl_svn7743_215

><td class="source">                } catch (Exception e) {<br></td></tr
><tr
id=sl_svn7743_216

><td class="source">                  e.printStackTrace();<br></td></tr
><tr
id=sl_svn7743_217

><td class="source">                  shakeEventMethod = null;<br></td></tr
><tr
id=sl_svn7743_218

><td class="source">                }<br></td></tr
><tr
id=sl_svn7743_219

><td class="source">              }<br></td></tr
><tr
id=sl_svn7743_220

><td class="source">            }<br></td></tr
><tr
id=sl_svn7743_221

><td class="source">            lastShake = now;<br></td></tr
><tr
id=sl_svn7743_222

><td class="source">          }<br></td></tr
><tr
id=sl_svn7743_223

><td class="source">          lastX = x;<br></td></tr
><tr
id=sl_svn7743_224

><td class="source">          lastY = y;<br></td></tr
><tr
id=sl_svn7743_225

><td class="source">          lastZ = z;<br></td></tr
><tr
id=sl_svn7743_226

><td class="source">          lastUpdate = now;<br></td></tr
><tr
id=sl_svn7743_227

><td class="source">        }<br></td></tr
><tr
id=sl_svn7743_228

><td class="source">      }<br></td></tr
><tr
id=sl_svn7743_229

><td class="source">      // trigger change event<br></td></tr
><tr
id=sl_svn7743_230

><td class="source">//      listener.onAccelerationChanged(x, y, z);<br></td></tr
><tr
id=sl_svn7743_231

><td class="source">      if (accelerationEventMethod != null) {<br></td></tr
><tr
id=sl_svn7743_232

><td class="source">        try {<br></td></tr
><tr
id=sl_svn7743_233

><td class="source">          accelerationEventMethod.invoke(context, new Object[] { x, y, z });<br></td></tr
><tr
id=sl_svn7743_234

><td class="source">        } catch (Exception e) {<br></td></tr
><tr
id=sl_svn7743_235

><td class="source">          e.printStackTrace();<br></td></tr
><tr
id=sl_svn7743_236

><td class="source">          accelerationEventMethod = null;<br></td></tr
><tr
id=sl_svn7743_237

><td class="source">        }<br></td></tr
><tr
id=sl_svn7743_238

><td class="source">      }<br></td></tr
><tr
id=sl_svn7743_239

><td class="source">    }<br></td></tr
><tr
id=sl_svn7743_240

><td class="source">  };<br></td></tr
><tr
id=sl_svn7743_241

><td class="source">}<br></td></tr
><tr
id=sl_svn7743_242

><td class="source"><br></td></tr
></table></pre>
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
</td>
</tr></table>

 
<script type="text/javascript">
 var lineNumUnderMouse = -1;
 
 function gutterOver(num) {
 gutterOut();
 var newTR = document.getElementById('gr_svn7743_' + num);
 if (newTR) {
 newTR.className = 'undermouse';
 }
 lineNumUnderMouse = num;
 }
 function gutterOut() {
 if (lineNumUnderMouse != -1) {
 var oldTR = document.getElementById(
 'gr_svn7743_' + lineNumUnderMouse);
 if (oldTR) {
 oldTR.className = '';
 }
 lineNumUnderMouse = -1;
 }
 }
 var numsGenState = {table_base_id: 'nums_table_'};
 var srcGenState = {table_base_id: 'src_table_'};
 var alignerRunning = false;
 var startOver = false;
 function setLineNumberHeights() {
 if (alignerRunning) {
 startOver = true;
 return;
 }
 numsGenState.chunk_id = 0;
 numsGenState.table = document.getElementById('nums_table_0');
 numsGenState.row_num = 0;
 if (!numsGenState.table) {
 return; // Silently exit if no file is present.
 }
 srcGenState.chunk_id = 0;
 srcGenState.table = document.getElementById('src_table_0');
 srcGenState.row_num = 0;
 alignerRunning = true;
 continueToSetLineNumberHeights();
 }
 function rowGenerator(genState) {
 if (genState.row_num < genState.table.rows.length) {
 var currentRow = genState.table.rows[genState.row_num];
 genState.row_num++;
 return currentRow;
 }
 var newTable = document.getElementById(
 genState.table_base_id + (genState.chunk_id + 1));
 if (newTable) {
 genState.chunk_id++;
 genState.row_num = 0;
 genState.table = newTable;
 return genState.table.rows[0];
 }
 return null;
 }
 var MAX_ROWS_PER_PASS = 1000;
 function continueToSetLineNumberHeights() {
 var rowsInThisPass = 0;
 var numRow = 1;
 var srcRow = 1;
 while (numRow && srcRow && rowsInThisPass < MAX_ROWS_PER_PASS) {
 numRow = rowGenerator(numsGenState);
 srcRow = rowGenerator(srcGenState);
 rowsInThisPass++;
 if (numRow && srcRow) {
 if (numRow.offsetHeight != srcRow.offsetHeight) {
 numRow.firstChild.style.height = srcRow.offsetHeight + 'px';
 }
 }
 }
 if (rowsInThisPass >= MAX_ROWS_PER_PASS) {
 setTimeout(continueToSetLineNumberHeights, 10);
 } else {
 alignerRunning = false;
 if (startOver) {
 startOver = false;
 setTimeout(setLineNumberHeights, 500);
 }
 }
 }
 function initLineNumberHeights() {
 // Do 2 complete passes, because there can be races
 // between this code and prettify.
 startOver = true;
 setTimeout(setLineNumberHeights, 250);
 window.onresize = setLineNumberHeights;
 }
 initLineNumberHeights();
</script>

 
 
 <div id="log">
 <div style="text-align:right">
 <a class="ifCollapse" href="#" onclick="_toggleMeta(this); return false">Show details</a>
 <a class="ifExpand" href="#" onclick="_toggleMeta(this); return false">Hide details</a>
 </div>
 <div class="ifExpand">
 
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="changelog">
 <p>Change log</p>
 <div>
 <a href="/p/processing/source/detail?spec=svn7743&amp;r=7743">r7743</a>
 by f...@processing.org
 on Mar 6, 2011
 &nbsp; <a href="/p/processing/source/diff?spec=svn7743&r=7743&amp;format=side&amp;path=/trunk/processing/android/examples/Sensors/Accelerometer/AccelerometerManager.java&amp;old_path=/trunk/processing/android/examples/Sensors/Accelerometer/AccelerometerManager.java&amp;old=">Diff</a>
 </div>
 <pre>add a couple examples, organizing todo</pre>
 </div>
 
 
 
 
 
 
 <script type="text/javascript">
 var detail_url = '/p/processing/source/detail?r=7743&spec=svn7743';
 var publish_url = '/p/processing/source/detail?r=7743&spec=svn7743#publish';
 // describe the paths of this revision in javascript.
 var changed_paths = [];
 var changed_urls = [];
 
 changed_paths.push('/trunk/processing/android/examples/Sensors');
 changed_urls.push('/p/processing/source/browse/trunk/processing/android/examples/Sensors?r\x3d7743\x26spec\x3dsvn7743');
 
 
 changed_paths.push('/trunk/processing/android/examples/Sensors/Accelerometer');
 changed_urls.push('/p/processing/source/browse/trunk/processing/android/examples/Sensors/Accelerometer?r\x3d7743\x26spec\x3dsvn7743');
 
 
 changed_paths.push('/trunk/processing/android/examples/Sensors/Accelerometer/Accelerometer.pde');
 changed_urls.push('/p/processing/source/browse/trunk/processing/android/examples/Sensors/Accelerometer/Accelerometer.pde?r\x3d7743\x26spec\x3dsvn7743');
 
 
 changed_paths.push('/trunk/processing/android/examples/Sensors/Accelerometer/AccelerometerManager.java');
 changed_urls.push('/p/processing/source/browse/trunk/processing/android/examples/Sensors/Accelerometer/AccelerometerManager.java?r\x3d7743\x26spec\x3dsvn7743');
 
 var selected_path = '/trunk/processing/android/examples/Sensors/Accelerometer/AccelerometerManager.java';
 
 
 changed_paths.push('/trunk/processing/android/examples/Sensors/Compass');
 changed_urls.push('/p/processing/source/browse/trunk/processing/android/examples/Sensors/Compass?r\x3d7743\x26spec\x3dsvn7743');
 
 
 changed_paths.push('/trunk/processing/android/examples/Sensors/Compass/Compass.pde');
 changed_urls.push('/p/processing/source/browse/trunk/processing/android/examples/Sensors/Compass/Compass.pde?r\x3d7743\x26spec\x3dsvn7743');
 
 
 changed_paths.push('/trunk/processing/android/examples/Sensors/Compass/CompassManager.java');
 changed_urls.push('/p/processing/source/browse/trunk/processing/android/examples/Sensors/Compass/CompassManager.java?r\x3d7743\x26spec\x3dsvn7743');
 
 
 changed_paths.push('/trunk/processing/android/todo.txt');
 changed_urls.push('/p/processing/source/browse/trunk/processing/android/todo.txt?r\x3d7743\x26spec\x3dsvn7743');
 
 
 function getCurrentPageIndex() {
 for (var i = 0; i < changed_paths.length; i++) {
 if (selected_path == changed_paths[i]) {
 return i;
 }
 }
 }
 function getNextPage() {
 var i = getCurrentPageIndex();
 if (i < changed_paths.length - 1) {
 return changed_urls[i + 1];
 }
 return null;
 }
 function getPreviousPage() {
 var i = getCurrentPageIndex();
 if (i > 0) {
 return changed_urls[i - 1];
 }
 return null;
 }
 function gotoNextPage() {
 var page = getNextPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoPreviousPage() {
 var page = getPreviousPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoDetailPage() {
 window.location = detail_url;
 }
 function gotoPublishPage() {
 window.location = publish_url;
 }
</script>

 
 <style type="text/css">
 #review_nav {
 border-top: 3px solid white;
 padding-top: 6px;
 margin-top: 1em;
 }
 #review_nav td {
 vertical-align: middle;
 }
 #review_nav select {
 margin: .5em 0;
 }
 </style>
 <div id="review_nav">
 <table><tr><td>Go to:&nbsp;</td><td>
 <select name="files_in_rev" onchange="window.location=this.value">
 
 <option value="/p/processing/source/browse/trunk/processing/android/examples/Sensors?r=7743&amp;spec=svn7743"
 
 >...cessing/android/examples/Sensors</option>
 
 <option value="/p/processing/source/browse/trunk/processing/android/examples/Sensors/Accelerometer?r=7743&amp;spec=svn7743"
 
 >...d/examples/Sensors/Accelerometer</option>
 
 <option value="/p/processing/source/browse/trunk/processing/android/examples/Sensors/Accelerometer/Accelerometer.pde?r=7743&amp;spec=svn7743"
 
 >.../Accelerometer/Accelerometer.pde</option>
 
 <option value="/p/processing/source/browse/trunk/processing/android/examples/Sensors/Accelerometer/AccelerometerManager.java?r=7743&amp;spec=svn7743"
 selected="selected"
 >...ometer/AccelerometerManager.java</option>
 
 <option value="/p/processing/source/browse/trunk/processing/android/examples/Sensors/Compass?r=7743&amp;spec=svn7743"
 
 >...android/examples/Sensors/Compass</option>
 
 <option value="/p/processing/source/browse/trunk/processing/android/examples/Sensors/Compass/Compass.pde?r=7743&amp;spec=svn7743"
 
 >...ples/Sensors/Compass/Compass.pde</option>
 
 <option value="/p/processing/source/browse/trunk/processing/android/examples/Sensors/Compass/CompassManager.java?r=7743&amp;spec=svn7743"
 
 >...sors/Compass/CompassManager.java</option>
 
 <option value="/p/processing/source/browse/trunk/processing/android/todo.txt?r=7743&amp;spec=svn7743"
 
 >/trunk/processing/android/todo.txt</option>
 
 </select>
 </td></tr></table>
 
 
 



 
 </div>
 
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="older_bubble">
 <p>Older revisions</p>
 
 <a href="/p/processing/source/list?path=/trunk/processing/android/examples/Sensors/Accelerometer/AccelerometerManager.java&start=7743">All revisions of this file</a>
 </div>
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="fileinfo_bubble">
 <p>File info</p>
 
 <div>Size: 6769 bytes,
 242 lines</div>
 
 <div><a href="//processing.googlecode.com/svn-history/r7743/trunk/processing/android/examples/Sensors/Accelerometer/AccelerometerManager.java">View raw file</a></div>
 </div>
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 </div>
 </div>


</div>

</div>
</div>

<script src="https://ssl.gstatic.com/codesite/ph/1729405847801014513/js/prettify/prettify.js"></script>
<script type="text/javascript">prettyPrint();</script>


<script src="https://ssl.gstatic.com/codesite/ph/1729405847801014513/js/source_file_scripts.js"></script>

 <script type="text/javascript" src="https://ssl.gstatic.com/codesite/ph/1729405847801014513/js/kibbles.js"></script>
 <script type="text/javascript">
 var lastStop = null;
 var initialized = false;
 
 function updateCursor(next, prev) {
 if (prev && prev.element) {
 prev.element.className = 'cursor_stop cursor_hidden';
 }
 if (next && next.element) {
 next.element.className = 'cursor_stop cursor';
 lastStop = next.index;
 }
 }
 
 function pubRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftDestroyed(data) {
 updateCursorForCell(data.cellId, 'nocursor');
 if (initialized) {
 reloadCursors();
 }
 }
 function reloadCursors() {
 kibbles.skipper.reset();
 loadCursors();
 if (lastStop != null) {
 kibbles.skipper.setCurrentStop(lastStop);
 }
 }
 // possibly the simplest way to insert any newly added comments
 // is to update the class of the corresponding cursor row,
 // then refresh the entire list of rows.
 function updateCursorForCell(cellId, className) {
 var cell = document.getElementById(cellId);
 // we have to go two rows back to find the cursor location
 var row = getPreviousElement(cell.parentNode);
 row.className = className;
 }
 // returns the previous element, ignores text nodes.
 function getPreviousElement(e) {
 var element = e.previousSibling;
 if (element.nodeType == 3) {
 element = element.previousSibling;
 }
 if (element && element.tagName) {
 return element;
 }
 }
 function loadCursors() {
 // register our elements with skipper
 var elements = CR_getElements('*', 'cursor_stop');
 var len = elements.length;
 for (var i = 0; i < len; i++) {
 var element = elements[i]; 
 element.className = 'cursor_stop cursor_hidden';
 kibbles.skipper.append(element);
 }
 }
 function toggleComments() {
 CR_toggleCommentDisplay();
 reloadCursors();
 }
 function keysOnLoadHandler() {
 // setup skipper
 kibbles.skipper.addStopListener(
 kibbles.skipper.LISTENER_TYPE.PRE, updateCursor);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_top', 50);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_bottom', 100);
 // Register our keys
 kibbles.skipper.addFwdKey("n");
 kibbles.skipper.addRevKey("p");
 kibbles.keys.addKeyPressListener(
 'u', function() { window.location = detail_url; });
 kibbles.keys.addKeyPressListener(
 'r', function() { window.location = detail_url + '#publish'; });
 
 kibbles.keys.addKeyPressListener('j', gotoNextPage);
 kibbles.keys.addKeyPressListener('k', gotoPreviousPage);
 
 
 }
 </script>
<script src="https://ssl.gstatic.com/codesite/ph/1729405847801014513/js/code_review_scripts.js"></script>
<script type="text/javascript">
 function showPublishInstructions() {
 var element = document.getElementById('review_instr');
 if (element) {
 element.className = 'opened';
 }
 }
 var codereviews;
 function revsOnLoadHandler() {
 // register our source container with the commenting code
 var paths = {'svn7743': '/trunk/processing/android/examples/Sensors/Accelerometer/AccelerometerManager.java'}
 codereviews = CR_controller.setup(
 {"loggedInUserEmail": "matthewdk54@gmail.com", "token": "ABZ6GAfVHcwicQ_1FpaUmZDoSWJvxhSiww:1418222673527", "profileUrl": "/u/106875562245387694310/", "projectHomeUrl": "/p/processing", "projectName": "processing", "assetVersionPath": "https://ssl.gstatic.com/codesite/ph/1729405847801014513", "relativeBaseUrl": "", "assetHostPath": "https://ssl.gstatic.com/codesite/ph", "domainName": null}, '', 'svn7743', paths,
 CR_BrowseIntegrationFactory);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, showPublishInstructions);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_PUB_PLATE, pubRevealed);
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, draftRevealed);
 codereviews.registerActivityListener(CR_ActivityType.DISCARD_DRAFT_COMMENT, draftDestroyed);
 
 
 
 
 
 
 
 var initialized = true;
 reloadCursors();
 }
 window.onload = function() {keysOnLoadHandler(); revsOnLoadHandler();};

</script>
<script type="text/javascript" src="https://ssl.gstatic.com/codesite/ph/1729405847801014513/js/dit_scripts.js"></script>

 
 
 
 <script type="text/javascript" src="https://ssl.gstatic.com/codesite/ph/1729405847801014513/js/ph_core.js"></script>
 
 
 
 
</div> 

<div id="footer" dir="ltr">
 <div class="text">
 <a href="/projecthosting/terms.html">Terms</a> -
 <a href="http://www.google.com/privacy.html">Privacy</a> -
 <a href="/p/support/">Project Hosting Help</a>
 </div>
</div>
 <div class="hostedBy" style="margin-top: -20px;">
 <span style="vertical-align: top;">Powered by <a href="http://code.google.com/projecthosting/">Google Project Hosting</a></span>
 </div>

 
 


 
 </body>
</html>

