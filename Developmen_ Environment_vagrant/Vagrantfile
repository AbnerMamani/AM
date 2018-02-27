
Vagrant.configure("2") do |config|

 config.ssh.username = 'ubuntu'
 config.ssh.private_key_path = ENV
 config.vm.provision "docker"
 config.vm.provision "docker_compose"

 config.vm.provider :openstack do |os, override|
   os.identity_api_version = ENV['OS_IDENTITY_API_VERSION']
   os.openstack_auth_url = ENV['OS_AUTH_URL'] 
   os.username           = ENV['OS_USERNAME']
   os.password           = ENV['OS_PASSWORD']
   os.domain_name        = ENV['OS_DOMAIN_NAME']
   os.tenant_name        = ENV['OS_TENANT_NAME']
   os.project_name       = ENV['OS_PROJECT_NAME']
   os.server_name        = ENV['OS_SERVER_NAME']
   os.flavor             = ENV['OS_FLAVOR']
   os.image              = ENV['OS_IMAGE']
   os.keypair_name       = ENV['OS_KEY_PAIR_NAME']
   override.vm.synced_folder '.', '/vagrant', disabled: true
 end

end
