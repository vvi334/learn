<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录注册表单</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css'>

    <link rel='stylesheet' href='https://ajax.aspnetcdn.com/ajax/bootstrap/4.2.1/css/bootstrap.min.css'>

    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <div class="container">
        <div class="card-wrap">
            <div class="card border-0 shadow card--welcome is-show" id="welcome">
                <div class="card-body">
                    <h2 class="card-title">欢迎光临</h2>
                    <p>欢迎进入登录页面</p>
                    <div class="btn-wrap"><a class="btn btn-lg btn-register js-btn" data-target="register">注册</a><a class="btn btn-lg btn-login js-btn" data-target="login">登录</a></div>
                </div>
            </div>
            <div class="card border-0 shadow card--register" id="register">
                <div class="card-body">
                    <form action="/registe">
                        <div class="form-group">
                            <input class="form-control" type="username" placeholder="用户名" required="required" />
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="email" placeholder="邮箱" required="required" />
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="password" placeholder="密码" required="required" />
                        </div>
                        <button class="btn btn-lg">注册</button>
                    </form>
                </div>
                <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
            </div>
        <form action="/login/{username}/{password}">
            <div class="card border-0 shadow card--login" id="login">
                <div class="card-body">
                    <h2 class="card-title">欢迎登录！</h2>
                    <form>
                        <div class="form-group">
                            <input class="form-control" type="username" placeholder="用户名" required="required" />
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="password" placeholder="密码" required="required" />
                        </div>
                        <button type="submit"  class="btn btn-lg">登录</button>
                     </form>
                    </form>
                </div>
                <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
            </div>
        </div>
    </div>
    <script src="/js/index.js"></script>
</body>
</html>